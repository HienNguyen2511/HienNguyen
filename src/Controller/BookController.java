package Controller;

import java.util.ArrayList;
import model.DAO.BookDAO;
import model.DTO.Book;

public class BookController {
	BookDAO bookDAO = new BookDAO();

	public ArrayList<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}

	public Book createBook(String name, int price) {
		return bookDAO.createBook(name, price);
	}

	public boolean addBook(Book b) {
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

}