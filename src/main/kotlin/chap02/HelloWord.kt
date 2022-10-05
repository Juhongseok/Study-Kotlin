package chap02

class HelloWord {
}

fun main(args: Array<String>) {
    println("hello, world")
}

//블록이 본문인 함수
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//식이 본문인 함수
fun max1(a: Int, b: Int): Int = if (a > b) a else b

//식이 본문인 함수는 반환 타입 생략 가능
fun max2(a: Int, b: Int) = if (a > b) a else b