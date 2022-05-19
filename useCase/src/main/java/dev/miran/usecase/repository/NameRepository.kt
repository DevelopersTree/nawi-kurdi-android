package dev.miran.usecase.repository

import dev.miran.entity.Name
import kotlinx.coroutines.flow.Flow

interface NameRepository {
    suspend fun observeNameList(): Flow<List<Name>>
    suspend fun loadNameList(): Int
    suspend fun updateNameList()

}