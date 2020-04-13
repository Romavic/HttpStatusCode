package ao.httpstatuscode.romavicdosanjoskc.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ao.httpstatuscode.romavicdosanjos.statusCode.*
import ao.httpstatuscode.romavicdosanjoskc.R
import ao.httpstatuscode.romavicdosanjoskc.network.api.ApiClient.apiClient
import ao.httpstatuscode.romavicdosanjoskc.network.api.ApiEndPoints
import ao.httpstatuscode.romavicdosanjoskc.network.model.PostsModel
import ao.httpstatuscode.romavicdosanjoskc.ui.adapters.PostsAdapter
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
                    response.code() == SuccessfulStatusCode.Ok -> {
                        postsAdapter = PostsAdapter(this@MainActivity, response.body()!!)
                        recyclerMain?.adapter = postsAdapter
                    }
                    response.code() == InformationalStatusCode.Continue -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Please wait...",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == ClientErrorStatusCode.BadRequest -> {
                        Toast.makeText(
                            this@MainActivity,
                            "The request could not be delivered due to incorrect syntax.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == RedirectionStatusCode.Found -> {
                        Toast.makeText(
                            this@MainActivity,
                            "The request was found.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == ServerErrorStatusCode.BadGateway -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Bad Gateway.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }

            override fun onFailure(call: Call<List<PostsModel>>, t: Throwable) {
                Log.i("Error", t.message.toString())
            }
        })
    }
}
