package chap06

fun main() {
    printAllCaps(null)
    printAllCaps("abc")
    println(strLenSafeV1(null))
    println(strLenSafeV2(null))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
    printSippingLabel(person)
    ignoreNulls(null)
}

fun printAllCaps(s: String?) = println(s?.uppercase())
fun strLenSafeV1(s: String?) = if (s != null) s.length else 0
fun strLenSafeV2(s: String?) = s?.length ?: 0

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name:String, val company: Company?)

fun printSippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun ignoreNulls(s: String?) {
//    val sNotNull = s!!
//    println(sNotNull.length)
    println(s?.let { it.length })
}