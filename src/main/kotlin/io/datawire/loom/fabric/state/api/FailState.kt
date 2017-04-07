package io.datawire.loom.fabric.state.api


object FailState : StateAction<State<*>> {

  override fun execute(state: State<*>) {
    throw RuntimeException("DELIBERATE FAILURE")
  }
}