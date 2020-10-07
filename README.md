# HttpStatusCode
This is a library that allows you to spell out the htpp status codes extensively.

**HttpStatusCode Library**

```Groovy
implementation 'com.github.Romavic:HttpStatusCode:1.1.1'
```

This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#2xx_Success)

The name class **SuccessfulStatusCode** was changed to **Successful**
```Kotlin

object Successful {

    @JvmStatic
    val Ok: Int = 200
        
//...and others Successful StatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#5xx_Server_errors)

The name class **ServerErrorStatusCode** was changed to **ServerError**

```Kotlin
object ServerError {

    @JvmStatic
    val InternalServerError: Int = 500

//...and others ServerError StatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#3xx_Redirection)

The name class **RedirectionStatusCode** was changed to **Redirection**

```Kotlin

object Redirection {

    @JvmStatic
    val MultipleChoices: Int = 300

//...and others Redirection StatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#1xx_Informational_response)

The name class **InformationalStatusCode** was changed to **Informational**

```Kotlin

object Informational {

    @JvmStatic
    val Continue: Int = 100
        
//...and others Informational StatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors)

The name class **ClientErrorStatusCode** was changed to **ClientError**

```Kotlin

object ClientError {

    @JvmStatic
    val BadRequest: Int = 400
        
//...and others ClientError StatusCode...
}
```
This example depicts the use of that library (HttpStatusCode) in an application that is consuming data from an api.
Is being used to check the status codes of the requisition at Api.

```Kotlin
               when {
                    response.code() == Successful.Ok -> {
                        postsAdapter = PostsAdapter(this@MainActivity, response.body()!!)
                        recyclerMain?.adapter = postsAdapter
                        progressMain?.visibility = View.GONE
                    }
                    response.code() == Informational.Continue -> {
                        Toast.makeText(this@MainActivity, "Please wait...", Toast.LENGTH_SHORT).show()
                        progressMain?.visibility = View.VISIBLE
                    }
                    response.code() == ClientError.BadRequest -> {
                        progressMain?.visibility = View.GONE
                        Toast.makeText(
                            this@MainActivity,
                            "The request could not be delivered due to incorrect syntax.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == Redirection.Found -> {
                        progressMain?.visibility = View.GONE
                        Toast.makeText(this@MainActivity, "The request was found.", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == ServerError.BadGateway -> {
                        progressMain?.visibility = View.GONE
                        Toast.makeText(this@MainActivity, "Bad Gateway.", Toast.LENGTH_SHORT).show()
                    }
                }
              
```

```Kotlin


class MainActivity : AppCompatActivity() {

    private var recyclerMain: RecyclerView? = null
    private var postsAdapter: PostsAdapter? = null
    private var progressMain: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMain = findViewById(R.id.recyclerMain)
        progressMain = findViewById(R.id.progressMain)
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
                    response.code() == Successful.Ok -> {
                        postsAdapter = PostsAdapter(this@MainActivity, response.body()!!)
                        recyclerMain?.adapter = postsAdapter
                        progressMain?.visibility = View.GONE
                    }
                    response.code() == Informational.Continue -> {
                        Toast.makeText(this@MainActivity, "Please wait...", Toast.LENGTH_SHORT).show()
                        progressMain?.visibility = View.VISIBLE
                    }
                    response.code() == ClientError.BadRequest -> {
                        progressMain?.visibility = View.GONE
                        Toast.makeText(
                            this@MainActivity,
                            "The request could not be delivered due to incorrect syntax.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    response.code() == Redirection.Found -> {
                        progressMain?.visibility = View.GONE
                        Toast.makeText(this@MainActivity, "The request was found.", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == ServerError.BadGateway -> {
                        progressMain?.visibility = View.GONE
                        Toast.makeText(this@MainActivity, "Bad Gateway.", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onFailure(call: Call<List<PostsModel>>, t: Throwable) {
                Log.i("Error", t.message.toString())
                progressMain?.visibility = View.GONE
            }
        })
    }
}
```
