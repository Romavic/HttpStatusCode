# HttpStatusCode
This is a bookstore that allows you to spell out the htpp status codes extensively.

**HttpStatusCode Library**

```Groovy
implementation 'com.github.Romavic:HttpStatusCode:1.0'
```

This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#2xx_Success)

```Kotlin
enum class Successful {
    OK, 
    CREATED, 
    ACCEPTED, 
    NON_AUTHORITATIVE_INFORMATION, 
    NO_CONTENT, 
    RESET_CONTENT, 
    PARTIAL_CONTENT, 
    MULTI_STATUS, 
    ALREADY_REPORTED, 
    IM_USED
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#5xx_Server_errors)

```Kotlin
enum class ServerError {
    INTERNAL_SERVER_ERROR, 
    NOT_IMPLEMENTED, 
    BAD_GATEWAY, 
    SERVICE_UNAVAILABLE, 
    GATEWAY_TIMEOUT, 
    HTTP_VERSION_NOT_SUPPORTED, 
    VARIANT_ALSO_NEGOTIATES, 
    INSUFICIENT_STORAGE, 
    LOOP_DETECTED, 
    NOT_EXTENDED, 
    NETWORK_AUTHENTICATION_REQUIRED
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#3xx_Redirection)

```Kotlin
enum class Redirection {
    MULTIPLE_CHOICES, 
    MOVED_PERMANENTLY, 
    FOUND, 
    SEE_OTHER, 
    NOT_MODIFIED, 
    USE_PROXY, 
    SWITCH_PROXY, 
    TEMPORARY_REDIRECT, 
    PERMANENT_REDIRECT
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#1xx_Informational_response)

```Kotlin
enum class Informational {
    CONTINUE, 
    SWITCHING_PROTOCOLS, 
    PROCESSING, 
    EARLY_HINTS
}
```
This code was built based on this link:(https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors)

```Kotlin
enum class ClientError {
    BAD_REQUEST,
    UNAUTHORIZED,
    PAYMENT_REQUIRED,
    FORBIDDEN,
    NOT_FOUND,
    METHOD_NOT_ALLOWED,
    NOT_ACCEPTABLE,
    PROXY_AUTHENTICATION_REQUIRED,
    REQUEST_TIMEOUT,
    CONFLICT,
    GONE,
    LENGTH_REQUIRED,
    PRECONDITION_FAILED,
    PAYLOAD_TOO_LARGE,
    URI_TOO_LONG,
    UNSUPPORTED_MEDIA_TYPE,
    RANGE_NOT_SATISFIABLE,
    EXPECTATION_FAILED,
    IM_A_TEAPOT,
    MISDIRECTED_REQUEST,
    UNPROCESSABLE_ENTITY,
    LOCKED,
    FAILED_DEPENDENCY,
    TOO_EARLY,
    UPGRADE_REQUIRED,
    PRECONDITION_REQUIRED,
    TOO_MANY_REQUEST,
    REQUEST_HEADER_FIELDS_TOO_LARGE,
    UNAVAILABLE_FOR_LEGAL_REASONS
}
```
This example depicts the use of that bookstore (HttpStatusCode) in an application that is consuming data from an api.
Is being used to check the status codes of the requisition at Api.

```Kotlin
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
```
