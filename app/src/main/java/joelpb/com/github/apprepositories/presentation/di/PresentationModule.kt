package joelpb.com.github.apprepositories.presentation.di

import joelpb.com.github.apprepositories.domain.ListUserRepositoriesUseCase
import joelpb.com.github.apprepositories.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load(){
        loadKoinModules(viewModelModule())
    }

    private fun viewModelModule(): Module {
        return module {
            viewModel { MainViewModel(get()) }
        }
    }
}