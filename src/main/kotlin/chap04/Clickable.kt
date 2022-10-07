package chap04

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable{
    override fun click() = println("I was clicked")
}

class Button1 : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    Button().click()
    val button1 = Button1()
    button1.showOff()
    button1.setFocus(true)
    button1.click()
}