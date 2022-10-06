package chap02

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    }else if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("UnKnown Expression")
}

fun eval1(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num : ${e.value}")
            e.value
        }
        is Sum -> {
            val left = eval1(e.left)
            val right = eval1(e.right)
            println("sum : $left + $right = ${left + right}")
            left + right
        }
        else -> throw IllegalArgumentException("UnKnown Expression")
    }


fun main() {
    println(eval1(Sum(Sum(Num(1), (Num(2))), Num(4))))
}