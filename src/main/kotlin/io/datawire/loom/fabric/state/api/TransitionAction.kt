package io.datawire.loom.fabric.state.api


interface TransitionAction {
  fun execute(source: String, target: String, transition: String)
}
