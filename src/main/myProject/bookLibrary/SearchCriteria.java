package main.myProject.bookLibrary;
@FunctionalInterface
public interface SearchCriteria {
    boolean match(Book book);
}
