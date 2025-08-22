data class Book(val title: String, val author: String, val price: Double)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun printBooks() {
        for (book in books) {
            println("Title: ${book.title}, Author: ${book.author}, Price: ${book.price}")
        }
    }
}

fun main() {
    val library = Library()
    library.addBook(Book("Atomic Habits", "James Clear", 450.0))
    library.addBook(Book("Ikigai", "Héctor García", 299.0))
    library.addBook(Book("The Alchemist", "Paulo Coelho", 399.0))
    library.printBooks()
}
