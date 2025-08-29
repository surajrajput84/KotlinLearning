data class Student(val name: String, val age: Int, val company: String)

fun main() {
    val studentsImmutable = listOf(
        Student("Suraj", 21, "Google"),
        Student("Om", 22, "Amazon"),
        Student("Abhishek", 20, "Microsoft"),
        Student("Pankaj", 23, "TCS"),
        Student("Raj", 21, "Infosys")
    )

    println("Immutable List:")
    println(studentsImmutable)

    val studentsMutable = mutableListOf("Suraj", "Om", "Abhishek", "Pankaj", "Raj")
    studentsMutable.add("Sita")
    studentsMutable.add("Gita")
    studentsMutable[1] = "Omkar"
    studentsMutable.remove("Abhishek")
    println("Element at index 2: ${studentsMutable[2]}")

    println("\nMutable List using for loop:")
    for (name in studentsMutable) {
        println(name)
    }

    println("\nMutable List using Iterator:")
    val iterator = studentsMutable.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
