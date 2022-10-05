package chap02

val question = "삶, 우주"

val answer1 : Int = 42

//변수를 바로 초기화 한다면 변수타입을 명시하지 않아도 됨
val answer = 42

/**
 * val - final 변수 (value) --> default로 사용
 * var - 일반 변수 (variation)
 *       변수 값은 변경 가능하지만 타입은 변경 불가능
 */

fun main() {
    val admin = true
    val user = "Bob"
    println("Hello $user") //--> String template System.out.println("Hello " + name)
    println("Hello ${if (admin) "admin" else user}") //--> 식으로 표현 가능
}