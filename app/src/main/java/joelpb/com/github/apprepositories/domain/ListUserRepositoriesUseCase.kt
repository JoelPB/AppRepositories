package joelpb.com.github.apprepositories.domain

import joelpb.com.github.apprepositories.core.UseCase
import joelpb.com.github.apprepositories.data.model.Repo
import joelpb.com.github.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}