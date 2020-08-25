package view;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.BookController;
import model.DTO.Book;

public class BookView {

	BookController bookController = new BookController();
	Scanner sc = new Scanner(System.in);

	public void execute() {
		while (true) {
			System.out.println("1. Show");
			System.out.println("2. Add");
			System.out.println("3. Delete");
			System.out.println("4. Update");
			System.out.println("0. Exit");
			int choose = sc.nextInt();
			sc.nextLine();

			switch (choose) {
			case 1:
				ArrayList<Book> allBooks = bookController.getAllBooks();
				for (int i = 0; i < allBooks.size(); i++) {
					System.out.println(allBooks.get(i).toString());
				}
				break;

			case 2:
				System.out.println("Import name book: ");
				String name = sc.next();
				System.out.println("Import price book: ");
				int price = sc.nextInt();
				Book book = new Book(name, price);
				break;

			case 3:
				System.out.println("Import name book you want to delete: ");
				String nameDeleteBook = sc.next();
				break;

			case 4:
				System.out.println("Import name of book you want to update: ");
				String nameUpdateBook = sc.next();

				if (bookController.isExistBook(nameUpdateBook)) {
					System.out.println("Name:");
					String newName = sc.next();
					System.out.println("Price:");
					int newPrice = sc.nextInt();
				}
				break;

			default:
				break;
			}
		}

	}

}