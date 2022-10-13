package chap06

import java.io.BufferedReader

fun main() {
    val source: Collection<Int> = arrayListOf(3,5,7)
    val target: MutableCollection<Int> = arrayListOf(1)

    copyElements(source, target)
    println(target)
}

fun readNumbers(reader: BufferedReader): List<Int?>{
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            result.add(line.toInt())
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

fun<T> copyElements(source: Collection<T>, target: MutableCollection<T>){
    for (item in source) {
        target.add(item)
    }
}