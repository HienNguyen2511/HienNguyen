package model.DAO;

import java.util.ArrayList;
import model.DTO.Author;
import java.util.Scanner;

public class AuthorDAO {
	ArrayList<Author> listAuthors = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public ArrayList<Author> getAllAuthor() {
		return listAuthors;
	}

	// add

	public boolean addAuthor(Author author) {
		try {
			listAuthors.add(author);
			return true;
		} catch (Exception e) {
			return false;
		}

//		listAuthors.add(author);
//	}
	}

	public boolean deleteAuthorBySTT(int stt) {
		try {
			listAuthors.remove(stt);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean deleteByName(String ten) {
		try {
			listAuthors.remove(ten);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
