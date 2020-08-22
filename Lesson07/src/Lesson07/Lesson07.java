package Lesson07;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookManagement bookManagement = new BookManagement();
		while (true) {
			System.out.println("1.Show");
			System.out.println("2.Add");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("5.Show types book");
			System.out.println("0.Exit");
			int inputUser = sc.nextInt();
			sc.nextLine();
			switch (inputUser) {
			case 1:
				bookManagement.showLib();
				break;

			case 2:
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Origin: ");
				String origin = sc.nextLine();
				System.out.println("Type: ");
				String type = sc.nextLine();
				System.out.println("Cost: ");
				int cost = sc.nextInt();
				System.out.println("Page: ");
				int page = sc.nextInt();

				Book b = new Book(name, cost, origin, type, page);
				boolean result = bookManagement.addBook(b);
				if (result) {
					System.out.println("Success");
				} else
					System.out.println("Fail");
				break;
			case 3:
				System.out.println("Import name of book which you want delate: ");
				String deleteBookName = sc.nextLine();
				int response = bookManagement.deleteBook(deleteBookName);
				if (response == 1) {
					System.out.println("Success");
				} else if (response == 0) {
					System.out.println("Not found");
				} else {
					System.out.println("Fail");
				}
				break;
			case 4:
				System.out.println("Import name of book which you want update: ");
				String nameUpdateBook = sc.nextLine();
				
				if (bookManagement.isExistBook(nameUpdateBook)) {
					System.out.println("Name: ");
					String newname = sc.nextLine();
					System.out.println("Origin: ");
					String neworigin = sc.nextLine();
					System.out.println("Type: ");
					String newtype = sc.nextLine();
					System.out.println("Cost: ");
					int newcost = sc.nextInt();
					System.out.println("Page: ");
					int newpage = sc.nextInt();

					Book newBook = new Book(newname, newcost, neworigin, newtype, newpage);
					bookManagement.updateBook(nameUpdateBook, newBook);
				} else {
					System.out.println("Not found");
				}
				break;
			case 5:
                ArrayList<String> types = bookManagement.filterBook();
                for (int i = 0; i < types.size(); i++) {
                    System.out.println(types.get(i));
                }
			case 6:
				bookManagement.sortCost();
                bookManagement.showLib();
                break;
			case 0:
				break;

			}
		}
	}
}
