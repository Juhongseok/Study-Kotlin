package chap04.companion

interface JsonFactory<T>{
    fun fromJson(jsonText: String): T
}

class Person(val name: String){
    companion object : JsonFactory<Person> {
        override fun fromJson(jsonText: String) = Person("user")
    }
}

fun <T> loadFromJson(factory: JsonFactory<T>) {
    println(factory.fromJson("asdf"))
}
fun main() {
    loadFromJson(Person)
}