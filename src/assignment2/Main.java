package assignment2;

import assignment2.Library;
import java.util.*;
import java.util.Scanner;

public class Main {

	static void printList(List<Book> bookList) {
		for (Book b : bookList)
			System.out.println(
					"Number:" + b.getBookNumber() + ",\tTitle:" + b.getBookTitle() + ",\tAuthor:" + b.getAuthor());
	}

	public static void main(String args[]) {
		Library.creationOfObjects();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\tMenu");
			System.out.println("1.Display Book Number-wise");
			System.out.println("2.Display Book Title-wise");
			System.out.println("3.Display Book Author-wise");
			System.out.println("4.Exit");
			System.out.println("Enter choice(1-4)");
			int choice = sc.nextInt();
			if (choice == 4)
				break;
			BookService b = new BookService();
			switch (choice) {
			case 1:
				printList(b.arrangeBooksNumberWise(Library.getAllBooks()));
				break;
			case 2:
				printList(b.arrangeBooksTitleWise(Library.getAllBooks()));
				break;
			case 3:
				printList(b.arrangeBooksAuthorWise(Library.getAllBooks()));
				break;
			}
		} while (true);
	}
}
