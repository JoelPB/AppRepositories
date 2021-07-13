package joelpb.com.github.apprepositories.data.repositories

import joelpb.com.github.apprepositories.data.model.Repo
import joelpb.com.github.apprepositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow{
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}