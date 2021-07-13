package joelpb.com.github.apprepositories.data.model


data class Repo (
    val id: Long,
    val name: String,
    val owner: Owner,
    val htmlURL: String,
    val description: String,
    val stargazersCount: Long,
    val language: String
)