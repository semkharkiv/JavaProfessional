package basicEgorov._10_08_2023;

import java.util.Objects;

public class Book {
    private String tittle;
    private String author;
    private int year;

    public Book(String tittle, String author, int year) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return year == book.year && Objects.equals(tittle, book.tittle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tittle, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
