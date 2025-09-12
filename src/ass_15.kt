fun main() {
    val countries = mapOf("India" to "Delhi", "USA" to "Washington", "UK" to "London")
    val mutableCountries = mutableMapOf("India" to "Delhi", "USA" to "Washington", "UK" to "London")
    mutableCountries["France"] = "Paris"
    mutableCountries["Germany"] = "Berlin"
    mutableCountries["India"] = "New Delhi"
    mutableCountries.remove("USA")
    println("Capital of India: ${mutableCountries["India"]}")
    println("For loop:")
    for ((country, capital) in mutableCountries) println("$country -> $capital")
    println("Iterator:")
    val itr = mutableCountries.entries.iterator()
    while (itr.hasNext()) {
        val entry = itr.next()
        println("${entry.key} -> ${entry.value}")
    }
}

