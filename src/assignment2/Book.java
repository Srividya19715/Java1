package assignment2;
import java.util.*;
import assignment2.Library;
public class Book  {
	Integer bookNumber;
	String bookTitle;
	String author;
	
	
	public Book(Integer bookNumber, String bookTitle, String author) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Integer getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(Integer bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
