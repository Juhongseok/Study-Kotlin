package chap04

open class RichButton : Clickable {
    fun disable(){}
    open fun animate(){}
    final override fun click() {
        TODO("Not yet implemented")
    }
}

abstract class Animated{
    abstract fun animate()
    open fun stopAnimating(){}
    fun animateTwice(){}
}