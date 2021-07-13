package joelpb.com.github.apprepositories.data.repositories

import joelpb.com.github.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}