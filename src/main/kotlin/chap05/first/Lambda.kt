package chap05.first

fun main() {
    val sum = {x:Int, y:Int -> x + y}
    val sum1 = {x:Int, y:Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(1, 2))
    println(sum1(1, 2))
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error:")

    val responses = listOf("403 Forbidden", "404 Not Found", "500 Internal server error", "200 Ok")
    printProblemCounts(responses)
}

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

//람다 안에서 로컬 변수 변경 가능
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        }else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}