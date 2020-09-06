package Controller;

import java.util.ArrayList;
import model.DAO.BookDAO;
import model.DTO.Book;
import java.util.UUID;

public class BookController {

	BookDAO bookDAO = new BookDAO();

	private static BookController instance;

	public static BookController getInstance() {
		if (instance == null) {
			instance = new BookController();
		}
		return instance;
	}

	private BookController() {

	}

	public ArrayList<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}

	public Book createBook(String name, int price) {
		return bookDAO.createBook(name, price);
	}

	public boolean addBook(Book b) {
		// sinh ngau nhien id cho book
//		String newID = UUID.randomUUID().toString();
//		b.setID(newID);
		return bookDAO.addBook(b);
	}

	public int deleteBook(String nameBook) {
		return bookDAO.deleteBook(nameBook);
	}

	public int updateBook(String nameOldBook, Book newBook) {
		return bookDAO.updateBook(nameOldBook, newBook);
	}

	public boolean isExistBook(String nameBook) {
		return bookDAO.isExistBook(nameBook);
	}

	public boolean deleteByStt(int stt) {
		return bookDAO.deleteByStt(stt);
	}

	public boolean deleteByName(String ten) {
		return bookDAO.deleteByName(ten);
	}


}