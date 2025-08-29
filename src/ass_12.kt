class Person(val name: String, val age: Int) {
    init {
        println("Welcome, $name!")
    }

    fun displayInfo() {
        println("Person -> Name: $name, Age: $age")
    }
}

class Employee(val name: String, val employeeId: Int) {
    constructor(name: String) : this(name, 0)

    fun showDetails() {
        println("Employee -> Name: $name, ID: $employeeId")
    }
}

class Car(val model: String) {
    var year: Int = 0

    constructor(model: String, year: Int) : this(model) {
        this.year = year
    }

    init {
        println("Car object created for model: $model")
    }

    fun showCarDetails() {
        if (year != 0) {
            println("Car -> Model: $model, Year: $year")
        } else {
            println("Car -> Model: $model")
        }
    }
}

fun main() {
    val person1 = Person("Suraj", 21)
    person1.displayInfo()

    val emp1 = Employee("Om", 101)
    val emp2 = Employee("Abhishek")
    emp1.showDetails()
    emp2.showDetails()

    val car1 = Car("Tesla")
    val car2 = Car("BMW", 2022)
    car1.showCarDetails()
    car2.showCarDetails()
}
