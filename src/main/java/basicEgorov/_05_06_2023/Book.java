package basicEgorov._05_06_2023;

public class Book {
    private Author author;
    private String title;
    private int yearIssue;

    public Book(Author author, String title, int yearIssue) {
        this.author = author;
        this.title = title;
        this.yearIssue = yearIssue;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", yearIssue=" + yearIssue +
                '}';
    }
}