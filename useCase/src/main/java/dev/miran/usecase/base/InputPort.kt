package dev.miran.usecase.base

interface InputPort<in O : OutputPort> {
    suspend fun registerOutputPort(outputPort: O)
}
