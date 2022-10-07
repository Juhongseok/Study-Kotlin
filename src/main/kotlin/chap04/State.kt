package chap04

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class ButtonView : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {}
    class ButtonState : State {}
}

class Outer{
    inner class Inner{
        fun getOuterReference() = this@Outer
    }
}