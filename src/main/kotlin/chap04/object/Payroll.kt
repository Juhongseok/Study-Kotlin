package chap04.`object`

import chap02.Person

object Payroll : Comparator<Person>{
    val allEmployees = arrayListOf<Person>()

    fun add(person: Person) {
        allEmployees.add(person)
    }

    fun calculateSalary(){
        for (person in allEmployees) {

        }
    }

    override fun compare(o1: Person, o2: Person) = o1.name.compareTo(o2.name)
}

fun main() {
    Payroll.calculateSalary()
    Payroll.add(Person("person", false))
//    Payroll payroll = Payroll()
}