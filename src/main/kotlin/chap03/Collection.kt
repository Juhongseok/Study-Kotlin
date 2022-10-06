package chap03

import chap03.strings.*

fun main() {
    val set = hashSetOf(1, 2, 3)
    println(set.javaClass)

    val list = listOf(1, 2, 3)
    println(list.toString())
    println(joinToString(list, "; ", "(", ")"))
    println(joinToString(list, separator = "; ", "(", ")"))
    println("Kotlin".lastChar()) // 확장 함수 사용 --> 함수
    println("Kotlin".lastChar) // 확장 프로퍼티 사용 --> 변수

    set.maxOrNull()
    val array: Array<Int> = arrayOf(4,5,6)

    val listOf = listOf(1, 2, 3, *array) // 스프레드 연산자 *
    //public fun <T> listOf(vararg elements: T): List<T> = if (elements.size > 0) elements.asList() else emptyList()
    //vararg -> java 에서 ...
    println(listOf)

    //구조 분해 선언
    //to -> infix function 흔히 사용하는 .to()방식으로 사용하지 않아도 됨
    val (number, name) = 1 to "one"

    mapOf(Pair(number, name))
    mapOf(1.to("one"))

}