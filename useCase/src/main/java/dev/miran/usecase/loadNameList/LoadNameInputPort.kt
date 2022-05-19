package dev.miran.usecase.loadNameList

import dev.miran.usecase.base.InputPort

interface LoadNameInputPort:InputPort<LoadNameOutputPort> {
    suspend fun startUpdatingNameList()
}