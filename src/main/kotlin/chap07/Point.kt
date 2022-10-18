package chap07

data class Point(var x: Int, var y: Int){
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)

    operator fun get(index: Int) =
        when(index){
            0-> x
            1-> y
            else-> throw IndexOutOfBoundsException("Invalid Index")
        }

    operator fun set(index: Int, value: Int) =
        when(index){
            0-> x = value
            1-> y = value
            else-> throw IndexOutOfBoundsException("Invalid Index")
        }

    /*operator fun component1() = x
    operator fun component2() = y*/
    // data class 기본적으로 구현 되어있음

    fun printEntries(map: Map<String, String>) {
        for ((key, value) in map) {
            println(key)
        }
    }

}

operator fun Point.minus(other: Point) = Point(x - other.x, y - other.y)
operator fun Point.plusAssign(other: Point) {
    x += other.x
    y += other.y
}

fun main() {
    val map = mapOf("one" to "one")

    val point1 = Point(1, 2)
    val point2 = Point(3, 4)

    point1.printEntries(map)

    println(point1.plus(point2))
    println(point1 + point2)
    println(point1 - point2)
    point1 += point2
    println(point1)

    println(point1[0])
    point1[1] = 1
    println(point1[1])

    val list = listOf(point1, point2)
    for ((x,y) in list) {
        println("x : $x, y : $y")
    }
}

/**
 * * times
 * / div
 * % rem
 * + plus
 * - minus
 * postfix Assign 사용시 +=/-= 처럼 사용가능
 *
 * 단항 연산자
 * + unaryPlus
 * - unaryMinus
 * ! not
 * ++ inc
 * -- dec
 *
 * 특이 케이스로 상위 클래스 override 통해서 사용, 상위 클래스에 operator 붙어있음 추가로 작성 필요 X
 * == equals
 * >=, >, <=, < compareTo
 *
 * 인덱스로 접근
 * [] get/set
 *
 * in contains()
 *
 * .. rangeTo
 * for 문 사용 iterator
 */