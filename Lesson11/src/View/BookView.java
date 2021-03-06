package View;

import Controller.BookController;
import Model.DTO.Book;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookView {

    BookController bookController = BookController.getInstance();
    BookController bookController2 =  BookController.getInstance();
    // 2 controller giong nhau vi deu la cua Instance

    Scanner sc = new Scanner(System.in);

    public void execute() throws SQLException {
        while (true) {
            boolean response;
            System.out.println("1. Show");
            System.out.println("2. Add");
            System.out.println("3. Delete By STT");
            System.out.println("4. Delete By Name");
            System.out.println("5. Update");
            System.out.println("0. Exit");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    ArrayList<Book> allBooks = bookController.getAllBook();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i).toString());
                    }
                    break;

                case 2:
                    System.out.println("Import name book: ");
                    String name = sc.next();
                    System.out.println("Import price book: ");
                    int price = sc.nextInt();
                    Book book = new Book();
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
                    response = bookController.deleteByStt(stt);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                case 4:
                    System.out.println("Nhap vao ten sach muon xoa: ");
                    String ten = sc.next();
                    response = bookController.deleteByName(ten);
                    if(response) {
                        System.out.println("success");
                    }else {
                        System.out.println("fail");
                    }
                    break;
                case 5:
                    System.out.println("Nhap ten sach muon update: ");
                    String nameUpdateBook = sc.nextLine();

                    if (bookController.isExistBook(nameUpdateBook)) {
                        System.out.println("Name:");
                        String newName = sc.next();
                        System.out.println("Price:");
                        int newPrice = sc.nextInt();

                        Book newBook = new Book();
                        bookController.updateBook(nameUpdateBook, newBook);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 0:
                    break;
            }
        }

    }
    public void renderView(){
        ArrayList<Book> list = BookController.getInstance().getAllBook();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}