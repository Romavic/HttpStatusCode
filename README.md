# HttpStatusCode
This is a library that allows you to spell out the htpp status codes extensively.

**HttpStatusCode Library**

###### What to expect from this new version?

1. The concept of Empathy driven development was applied to the class codes suggested by Alexandre Antonio Juca (https://github.com/AlexJuca);
2. Better facility in calling classes' HttpStatusCode methods;
3. Classes deprecated:
  - HttpStatusCode (the class and its methods.)

```Groovy
implementation 'com.github.romavic:HttpStatusCode:1.1'
```

This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#2xx_Success)

```Kotlin

object SuccessfulStatusCode {

    @JvmStatic
    val Ok: Int
        get() {
            successfulConnectionStatus = 200
            return successfulConnectionStatus
        }
        
//...and others SuccessfulStatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#5xx_Server_errors)

```Kotlin
object ServerErrorStatusCode {

    @JvmStatic
    val InternalServerError: Int
        get() {
            serverErrorConnectionStatus = 500
            return serverErrorConnectionStatus
        }

//...and others ServerErrorStatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#3xx_Redirection)

```Kotlin

object RedirectionStatusCode {

    @JvmStatic
    val MultipleChoices: Int
        get() {
            redirectionConnectionStatus = 300
            return redirectionConnectionStatus
        }

//...and others RedirectionStatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#1xx_Informational_response)

```Kotlin

object InformationalStatusCode {

    @JvmStatic
    val Continue: Int
        get() {
            informationalConnectionStatus = 100
            return informationalConnectionStatus
        }
        
//...and others InformationalStatusCode...
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors)

```Kotlin

object ClientErrorStatusCode {

    @JvmStatic
    val BadRequest: Int
        get() {
            clientErrorConnectionStatus = 400
            return clientErrorConnectionStatus
        }
        
//...and others ClientErrorStatusCode...
}
```
This example depicts the use of that bookstore (HttpStatusCode) in an application that is consuming data from an api.
Is being used to check the status codes of the requisition at Api.

```Kotlin
 when {
                    response.code() == SuccessfulStatusCode.Ok -> {
                        postsAdapter = PostsAdapter(this@MainActivity, response.body()!!)
                        recyclerMain?.adapter = postsAdapter
                    }
                    response.code() == InformationalStatusCode.Continue -> {
                        Toast.makeText(this@MainActivity, "Please wait...", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == ClientErrorStatusCode.BadRequest -> {
                        Toast.makeText(this@MainActivity, "The request could not be delivered due to incorrect syntax.", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == RedirectionStatusCode.Found -> {
                        Toast.makeText(this@MainActivity, "The request was found.", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == ServerErrorStatusCode.BadGateway -> {
                        Toast.makeText(this@MainActivity, "Bad Gateway.", Toast.LENGTH_SHORT).show()
                    }
                }
              
```

```Kotlin

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
                        Toast.makeText(this@MainActivity, "Please wait...", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == ClientErrorStatusCode.BadRequest -> {
                        Toast.makeText(this@MainActivity, "The request could not be delivered due to incorrect syntax.", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == RedirectionStatusCode.Found -> {
                        Toast.makeText(this@MainActivity, "The request was found.", Toast.LENGTH_SHORT).show()
                    }
                    response.code() == ServerErrorStatusCode.BadGateway -> {
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
```
