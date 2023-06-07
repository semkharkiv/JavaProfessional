package basicEgorov._05_06_2023;

import java.util.ArrayList;
import java.util.List;

public class Gen {
    public  List<Book> get() {
       Author author1 = new Author("Author1",false,33);
       Author author2 = new Author("Author2",true,35);
       Author author3 = new Author("Author3",true,40);

       Book book1 = new Book(author1,"Title1",1985);
       Book book2 = new Book(author2,"Title2",1945);
       Book book3 = new Book(author3,"Title4",1983);
       Book book4 = new Book(author3,"Title3",1936);
       Book book5 = new Book(author1,"Title5",1955);
       Book book6 = new Book(author2,"Title7",1996);

       List<Book> bookList = new ArrayList<>();
       bookList.add(book1);
       bookList.add(book2);
       bookList.add(book3);
       bookList.add(book4);
       bookList.add(book5);
       bookList.add(book6);
        return bookList;
    }
}
