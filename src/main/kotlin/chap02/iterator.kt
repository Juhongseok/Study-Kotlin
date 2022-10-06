package chap02

import java.util.*

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c:Char)=c !in '0'..'9'

fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter"
        else -> "I don't know"
    }

fun main() {
    for (i in 1.rangeTo(30)) {
        print(fizzBuzz(i))
    }

    for (i in 1 until 30) {
        print(fizzBuzz(i))
    }

    println()
    for (i in 1..30) {
        print(fizzBuzz(i))
    }
    println()
    for (i in 30 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    println()
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
//        binaryReps.put(c, Integer.toBinaryString(c.code))
        binaryReps[c] = Integer.toBinaryString(c.code)
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    val list = arrayListOf(1, 2, 3)
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}