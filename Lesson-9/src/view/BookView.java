package view;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.BookController;
import model.DTO.Book;

public class BookView {

	BookController bookController =  BookController.getInstance();
	BookController bookController2 =  BookController.getInstance();
	// 2 controller giong nhau vi deu la cua Instance
	
	Scanner sc = new Scanner(System.in);

	public void execute() {
		while (true) {
			boolean response;
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
				response = bookController.addBook(book);
				if (response) {
					System.out.println("success");
				} else {
					System.out.println("fail");
				}
				break;

			case 3:
				System.out.println("Nhap vao STT muon xoa: ");
				int stt = sc.nextInt();
				response = bookController.xoaTheoStt(stt);
				System.out.println(response);
				break;
			case 4:
				System.out.println("Nhap vao ten author muon xoa: ");

				break;
			}
		}

	}

}