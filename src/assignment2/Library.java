package assignment2;
import assignment2.Book;
import java.util.*;

public class Library {
    private static List<Book> booklist;
    
    static void  creationOfObjects() {
    	
    	booklist = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);

    	for(int i=0;i<2;i++) {
    		String Title = sc.next();
    		int Number = sc.nextInt();
    		String author = sc.next();
            Book book = new Book(Number,Title,author);
		    booklist.add(book);
    	}
    	/*List <Book> b1 = Library.getAllBooks();
        for(Book b: b1) {
        	System.out.println(b.getAuthor()+","+b.getBookNumber()+","+b.getBookTitle());
        }*/
	 }
    
    public static List<Book> getAllBooks(){
    	
    	return booklist;
    }
    
   
}
