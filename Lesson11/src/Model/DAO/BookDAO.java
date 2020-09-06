package Model.DAO;

import Model.DTO.Book;
import helper.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    DatabaseUtil dbUtil = new DatabaseUtil();

    public ArrayList<Book> getAllBook() throws SQLException {
        String sql = "Select * from Book";
        ArrayList<Book> bookList = new ArrayList<>();
        ResultSet rs = dbUtil.executeQuery(sql);
        while (rs.next()) {
            Book temp = new Book();
            temp.setId(rs.getInt("id"));
            temp.setName(rs.getString("name"));
            temp.setPrice(rs.getInt("price"));
            bookList.add(temp);
        }
        return bookList;
    }

    public boolean addBook(Book book) throws SQLException {

        String sql = "Import Book ('" + book.getName() + "','" + book.getPrice() + "')";
        try {
            dbUtil.updateQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateBook(String name, Book newBook) throws SQLException {
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean isExistBook(String nameBook) {
        try{

        }catch (Exception e) {
            System.out.println(e);
        }
            return false;
    }

    public boolean deleteBySTT(int stt) {
        try{

        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteByName(String ten) {
        try{

        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
