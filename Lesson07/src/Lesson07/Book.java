package Lesson07;

public class Book {
	
	public String name;
	double cost;
	String origin;
	String type;
	int page;

	public Book() {
		
	}
	public Book(String name, double cost, String origin, String type, int page) {
		this.name = name;
		this.cost = cost;
		this.origin = origin;
		this.type = type;
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void showInfor() {
		System.out.println("Name: " + this.name + "Cost: " + this.cost + "Origin: " + 
				this.origin + "Type: " + this.type+ "Page: " + this.page);
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", cost=" + cost + ", origin=" + origin + ", type=" + type + ", page=" + page
				+ "]";
	}
	
}
