package chap05.second

import chap05.first.Person
import kotlin.streams.toList

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })

    val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("Carol", 31))
    println(people.filter { it.age > 30})
    println(people.map { it.name})
    println(people.filter { it.age > 30 }.map(Person::name))

    println(people.filter { it.age == people.maxByOrNull(Person::age)!!.age })
    val maxAge = people.maxByOrNull(Person::age)!!.age
    println(people.filter { it.age == maxAge })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.uppercase() })
    println(numbers.filterKeys { it > 0 }.mapValues { it.value.uppercase()})

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))

    println(people.groupBy{it.age })

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val toList = people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()
    println(toList)
}