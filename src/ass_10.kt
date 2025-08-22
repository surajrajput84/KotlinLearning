class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 18)

    init {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val p1 = Person("Suraj", 22)
    val p2 = Person("Raj")
}
