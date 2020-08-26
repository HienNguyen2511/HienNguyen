package model.DTO;

import java.util.UUID;

public class Book {
	String name;
	int price;
	String id;
	String authorId;

	public Book() {

	}

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
		id = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}

}
