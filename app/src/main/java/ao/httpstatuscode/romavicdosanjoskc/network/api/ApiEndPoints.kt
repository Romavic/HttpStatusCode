package ao.httpstatuscode.romavicdosanjoskc.network.api

import ao.httpstatuscode.romavicdosanjoskc.network.model.PostsModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoints {
    @get:GET("posts")
    val posts: Call<List<PostsModel>>
}