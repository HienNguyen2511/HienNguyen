package Controller;

import java.util.ArrayList;
import java.util.List;

import model.DAO.AuthorDAO;
import model.DTO.Author;

public class AuthorController {

//AuthorDAO dao = new AuthorDAO();

	AuthorDAO dao;

	public AuthorController() {
		dao = new AuthorDAO();
	}

	public ArrayList<Author> getAllAuthor() {
		return dao.getAllAuthor();
	}

	public boolean addAuthor(Author author) {
		// co the xu li them du lieu o day
		return dao.addAuthor(author);
	}

	// [a1 a2 a3 a4...a10]
	public boolean deleteBySTT(int stt) {
		return dao.deleteAuthorBySTT(stt);
	}


	public boolean deleteByName(String ten) {
		return dao.deleteByName(ten);
	}

}
