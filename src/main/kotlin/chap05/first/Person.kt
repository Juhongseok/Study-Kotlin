package chap05.first

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)

    println(people.maxByOrNull() { p: Person -> p.age })
    println(people.maxByOrNull { p: Person -> p.age })
    println(people.maxByOrNull { p -> p.age })
    println(people.maxByOrNull (Person::age))
    println(people.maxByOrNull { it.age} )

    println(people.joinToString(separator = " ", transform = { p: Person -> p.name }))
    println(people.joinToString(" ") { p: Person -> p.name })
}