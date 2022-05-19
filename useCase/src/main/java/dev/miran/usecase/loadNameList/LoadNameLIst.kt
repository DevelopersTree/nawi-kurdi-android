package dev.miran.usecase.loadNameList

import dev.miran.usecase.base.UseCase
import dev.miran.usecase.repository.NameRepository
import dev.miran.usecase.util.tryTo
import javax.inject.Inject

class LoadNameList @Inject constructor(private val repository: NameRepository) :
    UseCase<LoadNameOutputPort>(), LoadNameInputPort {

    override suspend fun onReady() {
        observeNames()


    }

    override suspend fun startUpdatingNameList() {
        showLoading()
        val e = tryTo {
            updateNames()
        }

        hideLoading()
        e?.let {
            throw it
        }
    }

    private
    suspend fun showLoading() =
        outputPort.showLoading(true)

    private suspend fun hideLoading() =
        outputPort.showLoading(false)

    private suspend fun updateNames() = repository.updateNameList()

    private suspend fun observeNames() =
        outputPort.startObserveNameList(repository.observeNameList())


}