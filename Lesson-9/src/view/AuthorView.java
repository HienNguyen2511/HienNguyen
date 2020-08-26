package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Controller.AuthorController;

import model.DTO.Author;

public class AuthorView {

	AuthorController authorController = new AuthorController();
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
				ArrayList<Author> allAuthors = authorController.getAllAuthor();
				for (int i = 0; i < allAuthors.size(); i++) {
					System.out.println("STT" + i + ":" + allAuthors.get(i).toString());
				}
				break;

			case 2:
				System.out.println("Import name : ");
				String name = sc.next();
				System.out.println("Import age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap ngay sinh: ");
				int date = sc.nextInt();

				System.out.println("Nhap thang sinh: ");
				int month = sc.nextInt();

				System.out.println("Nhap nam sinh: ");
				int year = sc.nextInt();
				sc.nextLine();

				Date birthday = new Date(year - 1900, month - 1, date);
				// input date tu ban phim
				Author author = new Author(name, age, birthday);

				response = authorController.addAuthor(author);
				if (response) {
					System.out.println("success");
				} else {
					System.out.println("fail");
				}
				break;

			case 3:
				System.out.println("Nhap vao STT muon xoa: ");
				int stt = sc.nextInt();
				response = authorController.deleteBySTT(stt);
				System.out.println(response);
				break;
			case 4:
				System.out.println("Nhap vao ten author muon xoa: ");
				String ten = sc.next();
				response = authorController.deleteByName(ten);
				System.out.println(response);
				break;
			}
		}

	}

}