package dev.miran.nawikurdi.di.controler

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dev.miran.usecase.loadNameList.LoadNameInputPort
import dev.miran.usecase.loadNameList.LoadNameList

@Module
@InstallIn(ViewModelComponent::class)
interface InputPortsModule {

    @Binds
    @ViewModelScoped
    fun provideLoadMovieListInputPort(inputPort: LoadNameList): LoadNameInputPort

}
