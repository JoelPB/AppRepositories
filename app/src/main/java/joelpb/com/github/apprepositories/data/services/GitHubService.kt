package joelpb.com.github.apprepositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositor(@Path("user") user: String): List<Repo>
}