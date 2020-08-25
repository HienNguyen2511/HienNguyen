package model.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.DTO.Book;

public class BookDAO {

	ArrayList<Book> library = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public BookDAO() {
		Book defaultBook = new Book("BookA", 1000);
		library.add(defaultBook);
	}

	public ArrayList<Book> getAllBooks() {
		return library;

	}

	// Create Book
	public Book createBook(String name, int price) {
		Book book = new Book();
		book.setName(name);
		book.setPrice(price);
		return book;
	}

	// Add
	public boolean addBook(Book book) {
		try {
			library.add(book);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Delete
	public int deleteBook(String nameBook) { // 1: Thanh cong, -1: Xoa that bai, 0: Khong tim thay sach
		Book book = new Book();
		boolean isExistBook = false;

		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getName().equals(nameBook)) {
				book = library.get(i);
				isExistBook = true;
			}
		}
		if (isExistBook) {
			boolean resultDelete = library.remove(book);
			if (resultDelete) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	// Update
	public int updateBook(String nameOldBook, Book newBook) {
		int indexOfBook = -1;
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getName().equals(nameOldBook)) {
				indexOfBook = i;
			}
		}
		if (indexOfBook != -1) {
			library.set(indexOfBook, newBook);
			if (library.get(indexOfBook).getName().equals(newBook.getName())) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	// Check Book Exist
	public boolean isExistBook(String nameOfBook) {
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getName().equals(nameOfBook)) {
				return true;
			}
		}
		return false;
	}
}