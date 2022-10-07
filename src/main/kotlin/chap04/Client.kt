package chap04

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name='$name', postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int = 31 * name.hashCode() + postalCode
}

data class Client1(val name: String, val postalCode: Int)

fun main() {
    val client = Client1("client", 100)
    println(client)
    println(client == client.copy(postalCode = 200))
    println(client == client.copy())
}