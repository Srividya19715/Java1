package assignment2;

import java.util.Collections;
import java.util.*;

public class BookService {
    public List<Book> arrangeBooksNumberWise(List<Book> bookList)
    {
        Collections.sort(bookList, (p1, p2) -> {
         return p1.getBookNumber().compareTo(p2.getBookNumber()); 
      });
      return bookList;
    }
    public List<Book> arrangeBooksTitleWise(List<Book> bookList)
    {
        Collections.sort(bookList,(p1,p2)->{
            return p1.getBookTitle().compareTo(p2.getBookTitle());
        });
        return bookList;
    }
    public List<Book> arrangeBooksAuthorWise(List<Book> bookList)
    {
        Collections.sort(bookList,(p1,p2)->{
            return p1.getAuthor().compareTo(p2.getAuthor());
        });
        return bookList;
    }

}