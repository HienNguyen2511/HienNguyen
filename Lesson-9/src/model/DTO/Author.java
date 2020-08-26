package model.DTO;

import java.util.Date;
import java.util.UUID;

public class Author {

	String name;
	int age;
	Date birthday;
	String id = UUID.randomUUID().toString();

	public Author() {
//		id = UUID.randomUUID().toString();

	}

	public Author(String name, int age, Date birthay) {
		this.name = name;
		this.age = age;
		this.birthday = birthay;
//		id = UUID.randomUUID().toString();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;

	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", birthday=" + birthday + ", id=" + id + "]";
	}

}
