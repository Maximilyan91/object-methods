import java.util.Objects;

public class Book {
    public String nameBook;
    public int year;

    public Book(String nameBook, int year) {
        this.nameBook = nameBook;
        this.year = year;
    }
    public String getNameBook() {
        return this.nameBook;
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги " + nameBook + ", год издания: " + year + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, year);
    }
}
