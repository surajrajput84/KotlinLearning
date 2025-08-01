class Student(val name: String, val roll: Int, val marks: Int) {
    fun calculateGrade(): Char {
        return when {
            marks >= 75 -> 'A'
            marks >= 50 -> 'B'
            else -> 'C'
        }
    }
}

fun main() {
    val student1 = Student("Rushabh", 1, 82)
    val student2 = Student("Amogh", 2, 67)
    val student3 = Student("kishan", 3, 45)

    val students = listOf(student1, student2, student3)

    for (student in students) {
        println("${student.name} Roll No: ${student.roll} has Grade: ${student.calculateGrade()}")
         }
}