package Model.DAO;

import helper.DatabaseUtil;
import Model.DTO.Author;
import Model.DTO.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuthorDAO {
    DatabaseUtil dbUtil = new DatabaseUtil();

    public ArrayList<Author> getAllAuthor() throws SQLException {
        String sql = "Select * from Author";
        ArrayList<Author> authorList = new ArrayList<>();
        ResultSet rs = dbUtil.executeQuery(sql);
        while (rs.next()) {
            Author temp = new Author();
            temp.setId(rs.getInt("id"));
            temp.setName(rs.getString("name"));
            temp.setAge(rs.getInt("age"));
            authorList.add(temp);
        }
        return authorList;

    }

    public boolean addAuthor(Author author) throws SQLException {

        String sql = "Import Author ('" + author.getName() + "','" + author.getAge() + "')";
        try {
            dbUtil.updateQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateAuthor(String name) throws SQLException {
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public boolean deleteAuthorBySTT(int stt) throws  SQLException{
        try {

        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public boolean deleteAuthorByName(String ten) throws SQLException {
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}