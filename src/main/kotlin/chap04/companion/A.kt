package chap04.companion

class A {
    //자바의 static 처럼 사용
    companion object{
        fun bar() = println("Companion object called")
    }
}

fun main() {
    A.bar()
}