package com.example.codingassestment.di

import com.example.codingassestment.data.repository.GetUserListRepository
import com.example.codingassestment.data.repository.UserListRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindUserListRepository(
        userListRepositoryImpl: UserListRepositoryImpl,
    ): GetUserListRepository


}