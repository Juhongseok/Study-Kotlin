package chap05.second

fun main() {
    println(alphabetV1())
    println(alphabetV2())
}

fun alphabetV1(): String{
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }

    return result.append("\nNow I know the alphabet").toString()
}

fun alphabetV2() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet").toString()
}

fun alphabetV3() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}.toString()

fun alphabetV4() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}