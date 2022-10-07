package chap04.delegate

class DelegatingCollection<T>: Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size = innerList.size

    override fun contains(element: T) = innerList.contains(element)

    override fun containsAll(elements: Collection<T>) = innerList.containsAll(elements)

    override fun isEmpty() = innerList.isEmpty()

    override fun iterator() = innerList.iterator()
}

class DelegationCollection<T>(
    var innerList: MutableList<T> = ArrayList<T>()
):MutableList<T> by innerList{
    var objectsAdded = 0;

    override fun add(element: T): Boolean {
        objectsAdded++;
        return innerList.add(element)
    }
}

fun main() {
    val delegationCollection = DelegationCollection<String>()

    delegationCollection.add("1")
    println(delegationCollection.objectsAdded)
}