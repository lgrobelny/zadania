package Collections.List;

public class Book {
    String author;
    String nameOfTheBook;

    public Book(String author, String nameOfTheBook) {
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }
}
