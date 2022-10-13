package chap06

fun main() {
    val x = 1
    val list = listOf(1L, 2L, 3L, 4L)
//    println(x in list)
    println(x.toLong() in list)

    var answer: Any = 42
    answer = "asdf"

    println(answer)
    fail("fail")
}

fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}