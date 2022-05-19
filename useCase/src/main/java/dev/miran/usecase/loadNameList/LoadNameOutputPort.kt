package dev.miran.usecase.loadNameList

import dev.miran.entity.Name
import dev.miran.usecase.base.OutputPort
import kotlinx.coroutines.flow.Flow

interface LoadNameOutputPort :OutputPort{
    suspend fun showLoading(loading:Boolean)
    suspend fun startObserveNameList(flow: Flow<List<Name>>)

}