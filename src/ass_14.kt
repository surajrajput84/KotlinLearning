fun main() {
    val numbers = mutableSetOf(1, 2, 3, 4, 2, 3, 5)
    println("Initial Set: $numbers")

    numbers.add(6)
    numbers.add(7)
    numbers.add(8)

    numbers.remove(3)
    numbers.add(30)

    numbers.remove(2)

    println("All Elements: $numbers")

    println("\nUsing for loop:")
    for (num in numbers) {
        println(num)
    }

    println("\nUsing Iterator:")
    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
