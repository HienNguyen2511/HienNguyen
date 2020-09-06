package Controller;

import Model.DAO.BookDAO;
import Model.DTO.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController {
    private static final BookController INSTANCE = new BookController();
    BookDAO bookDAO = new BookDAO();

    private BookController() {

    }

    public static BookController getInstance() {
        return INSTANCE;
    }

    public ArrayList<Book> getAllBook() {
        ArrayList<Book> listBook = new ArrayList<>();
        try {
            listBook = bookDAO.getAllBook();
            // mess : thanh cong
        } catch (Exception e) {
            // mess: that bai
        } finally {
            return listBook;
        }
    }

    public boolean addBook(Book book) throws SQLException {
        try {
            bookDAO.addBook(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteByStt(int stt) throws SQLException {
        try {
            return bookDAO.deleteBySTT(stt);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteByName(String ten) throws SQLException {
        try {
            return bookDAO.deleteByName(ten);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isExistBook(String nameBook) throws SQLException {
        try {
            return bookDAO.isExistBook(nameBook);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateBook(String nameOldBook, Book newBook) throws SQLException {
        try {
            return bookDAO.updateBook(nameOldBook, newBook);
        } catch (Exception e) {
            return false;
        }
    }
}