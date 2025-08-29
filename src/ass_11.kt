class Person(val name: String, val age: Int) {

    init {
        println("Welcome, $name!")
    }

    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val p1 = Person("Suraj", 21)
    p1.displayInfo()
}
