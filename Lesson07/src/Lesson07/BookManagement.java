package Lesson07;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement { // DAO : Data Access Object
	ArrayList<Book> library = new ArrayList<>();
	ArrayList<String> type = new ArrayList<>();

	public void showLib() {
		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i).toString());
		}
	}

	public boolean addBook(Book book) {
		try {
			library.add(book);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateBook(String nameOldBook, Book newBook) {
		int indexOfBook = -1;
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getName().equals(nameOldBook)) {
				indexOfBook = i;
			}
		}
		if (indexOfBook == -1) {
			return false;
		} else {
			library.set(indexOfBook, newBook);
			return true;
		}
	}

	public int deleteBook(String nameBook) { // 1: Thanh cong, -1: Xoa that bai, 0: Khong tim thay sach
		Book book = new Book();
		boolean isBookExist = false;
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getName().equals(nameBook)) {
				book = library.get(i);
				isBookExist = true;
			}
		}
		if (isBookExist) {
			boolean response = library.remove(book);
			if (response) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	public boolean isExistBook(String nameOfBook) {
		for (int i = 0; i < library.size(); i++) {
			if (library.get(i).getName().equals(nameOfBook)) {
				return true;
			}
		}
		return false;
	}

	// public ArrayList<Book> sortByPrice() {
//        ArrayList<Book> books = library;
//
//    }
	public ArrayList<String> filterBook() {
		for (int i = 0; i < library.size(); i++) {
			String currentBookType = library.get(i).getType();
			boolean isNewType = true;
			for (int j = 0; j < type.size(); j++) {
				if (currentBookType.equals(type.get(j))) {
					isNewType = false;
				}
			}
			if (isNewType) {
				type.add(currentBookType);
			}
		}
		return type;
	}
	
	public ArrayList<String> showBook (String typeOfBook){
		for(int i =0; i<library.size();i++){
			if(library.get(i).getType().equals(typeOfBook)) {
				type.add(library.get(i).getType());
			}
			else {
				System.out.println("Not found");
			}
		}
		for(int i=0;i<type.size();i++) {
			System.out.println(type.get(i));
		}
		return type;
	}
	
	public ArrayList <Book> sortCost (){
		Book temp = new Book();
		 temp.setCost(0);
		 int n =library.size();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(library.get(i).getCost() > library.get(i+1).getCost()){

				temp.setName(library.get(i).getName());
                temp.setCost(library.get(i).getCost());
                temp.setOrigin(library.get(i).getOrigin());
                temp.setType(library.get(i).getType());
                temp.setPage(library.get(i).getPage());
                
                library.get(i).setName(library.get(i+1).getName());
                library.get(i).setCost(library.get(i+1).getCost());
                library.get(i).setOrigin(library.get(i+1).getOrigin());
                library.get(i).setType(library.get(i+1).getType());
                library.get(i).setPage(library.get(i+1).getPage());
                
                library.get(i+1).setName(temp.getName());
                library.get(i+1).setCost(temp.getCost());
                library.get(i+1).setOrigin(temp.getOrigin());
                library.get(i+1).setType(temp.getType());
                library.get(i+1).setPage(temp.getPage());
            }
        }
        }
        return library;
	}
}