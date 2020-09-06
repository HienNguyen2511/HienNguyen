package Controller;

import Model.DAO.AuthorDAO;
import Model.DTO.Author;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuthorController {
    private static final AuthorController INSTANCE = new AuthorController();
    AuthorDAO authorDAO = new AuthorDAO();

    private AuthorController(){

    }

    public static AuthorController getInstance(){
        return INSTANCE;
    }

    public ArrayList<Author> getAllAuthor(){
        ArrayList<Author> listAuthor = new ArrayList<>();
        try {
            listAuthor = authorDAO.getAllAuthor();
        } catch (Exception e) {
            System.out.println("That bai");
        } finally{
            return listAuthor;
        }
    }

    public boolean addAuthor(Author author) throws SQLException{
        try {
            return authorDAO.addAuthor(author);
        } catch (Exception e) {
            return false;
        }
    }
    public boolean deleteBySTT(int stt) throws SQLException{
        try{
            return authorDAO.deleteAuthorBySTT(stt);
        }catch (Exception e){
            return false;
        }
    }
    public boolean deleteByName(String ten) throws  SQLException{
        try{
            return authorDAO.deleteAuthorByName(ten);
        }catch (Exception e){
            return false;
        }
    }
}