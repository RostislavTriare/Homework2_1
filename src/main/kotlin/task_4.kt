class Reader {
    var fio=" "
    var numberbil=0
    var faculty = " "
    var dateB=" "
    var phone = " "

    fun takebook(book:Int){
        println("$fio взял $book книг")
    }
    fun takeBook(vararg books: String?) {
        println(this.fio.toString() + " взял следующие книги:")
        for (book in books) {
            println(book)
        }
        println()
    }

    fun takeBook(vararg books: Book) {
        println(this.fio.toString() + " взял следующие книги:")
        for (book in books) {
            println(book.name + ", автор - " + book.author)
        }
        println()
    }
    fun returnBook(number: Int) {
        println(fio + " вернул " + number + " книги.")
    }

    fun returnBook(vararg books: String?) {
        println(fio + " вернул следующие книги:")
        for (book in books) {
            println(book)
        }
        println()
    }

    fun returnBook(vararg books: Book) {
        println(fio + " вернул следующие книги:")
        for (book in books) {
            println(book.name + ", автор - " + book.author)
        }
        println()
    }

}


    class Book{
        var name=" "
        var author = " "
        fun vuvid(){
            println("назва книги - $name автор - $author")
        }
    }

fun main(){
    val Reader1 = Reader()
    Reader1.fio="Alex Myl Pokl"
    Reader1.numberbil=1
    Reader1.faculty="oo"
    Reader1.dateB="20.04.2003"
    Reader1.phone="380939143459"
    val Reader2 = Reader()
    Reader1.fio="Sasha Myl Pokl"
    Reader1.numberbil=2
    Reader1.faculty="oo"
    Reader1.dateB="02.12.2003"
    Reader1.phone="380939666459"

    val Book1 = Book()
    Book1.name="Kotlin"
    Book1.author="Htos"
    val Book2 = Book()
    Book2.name="PHP"
    Book1.author="Htosm"

    Reader1.takebook(5)
    Reader2.takeBook("Hto&","Chto","Zachem")
    Reader2.takeBook(Book1,Book2)

    Reader1.returnBook(2)
    Reader2.returnBook("Hto&","Chto","Zachem")
    Reader2.returnBook(Book2)

}