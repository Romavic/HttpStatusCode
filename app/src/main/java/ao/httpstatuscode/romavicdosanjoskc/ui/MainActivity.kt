package ao.httpstatuscode.romavicdosanjoskc.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ao.httpstatuscode.romavicdosanjos.HttpStatusCode.CLIENT_ERROR
import ao.httpstatuscode.romavicdosanjos.HttpStatusCode.INFORMATIONAL
import ao.httpstatuscode.romavicdosanjos.HttpStatusCode.REDIRECTION
import ao.httpstatuscode.romavicdosanjos.HttpStatusCode.SERVER_ERROR
import ao.httpstatuscode.romavicdosanjos.HttpStatusCode.SUCCESSFUL
import ao.httpstatuscode.romavicdosanjos.enumsStatesCode.*
import ao.httpstatuscode.romavicdosanjoskc.R
import ao.httpstatuscode.romavicdosanjoskc.network.ApiClient.apiClient
import ao.httpstatuscode.romavicdosanjoskc.network.ApiEndPoints
import ao.httpstatuscode.romavicdosanjoskc.network.adapters.PostsAdapter
import ao.httpstatuscode.romavicdosanjoskc.network.model.PostsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var recyclerMain: RecyclerView? = null
    private var postsAdapter: PostsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMain = findViewById(R.id.recyclerMain)
        recyclerMain?.layoutManager = LinearLayoutManager(this)
        recyclerMain?.setHasFixedSize(true)

        val apiEndPoints = apiClient!!.create(ApiEndPoints::class.java)
        val call = apiEndPoints.posts

        call.enqueue(object : Callback<List<PostsModel>> {
            override fun onResponse(
                call: Call<List<PostsModel>>,
                response: Response<List<PostsModel>>
            ) {
                when {
                    response.code() == SUCCESSFUL(Successful.OK) -> {
                        postsAdapter = PostsAdapter(this@MainActivity, response.body()!!)
                        recyclerMain?.adapter = postsAdapter
                    }
                    response.code() == INFORMATIONAL(Informational.CONTINUE) -> {
                        Toast.makeText(this@MainActivity, "Please wait...", Toast.LENGTH_SHORT)
                            .show()
                    }
                    response.code() == CLIENT_ERROR(ClientError.BAD_REQUEST) -> {
                        Toast.makeText(
                            this@MainActivity,
                            "The request could not be delivered due to incorrect syntax.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == REDIRECTION(Redirection.FOUND) -> {
                        Toast.makeText(
                            this@MainActivity,
                            "The request was found.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == SERVER_ERROR(ServerError.BAD_GATEWAY) -> {
                        Toast.makeText(this@MainActivity, "Bad Gateway.", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onFailure(call: Call<List<PostsModel>>, t: Throwable) {
                Log.i("Error", t.message.toString())
            }
        })
    }
}
