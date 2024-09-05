package com.example.codingassestment.di

import com.example.codingassestment.data.remote.UserApi
import com.example.codingassestment.data.repository.GetUserListRepository
import com.example.codingassestment.domain.useCases.GetUserListUseCaseImpl
import com.example.codingassestment.presentation.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Singleton
   /* @Provides
    fun provideUserRepository(
        api: UserApi
    ) = UserListRepositoryImpl(api)*/

    @Provides
    fun provideUserRepository(userListRepository: GetUserListRepository): GetUserListUseCaseImpl {
        return GetUserListUseCaseImpl(userListRepository)
    }

    @Singleton
    @Provides
    fun injectBackendRetrofitApi() : UserApi {

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(UserApi::class.java)
    }

}