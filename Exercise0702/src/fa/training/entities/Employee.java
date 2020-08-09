package fa.training.entities;

//Create an array of 5 employee object and input data from the keyboard. 
//Invalid values ​​require repeat re-input until correct value.
//Display employee that salary >=1000

import java.util.Scanner;
import fa.training.utils.Validator;

public class Employee {
	private int id;
	private String employeeName;
	private byte gender;
	private String email;
	private String address;
	private double salary;

	public Employee() {
	}

	public Employee(int id, String employeeName, byte gender, String email, String address, double salary) {
		this.id = id;
		this.employeeName = employeeName;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String employeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public String email() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String address() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@SuppressWarnings("resource")
	public void input(){
		Scanner scanner = new Scanner (System.in);
				boolean status;
		do {
			status = false;
			System.out.print("Enter id(number): ");
			try {
				id = Integer.parseInt(scanner.nextLine());
			}catch (Exception exception) {
				status = true;
			}
		}
			while (status);
			System.out.print("Enter name: ");
			employeeName = scanner.nextLine();
			do {
				status = false;
				System.out.print("Enter gender (1: male, 0: femail): ");
				try {
					gender=Byte.parseByte(scanner.nextLine());
					status = !(Validator.isGender(gender));
				}
				catch(Exception exception) {
					status =true;
				}
			}
			while(status);
			do {
				status =false;
				System.out.print("Enter email (follow email format): ");
				try {
					email=scanner.nextLine();
					status=!(Validator.isEmail(email));
				}
				catch(Exception exception) {
					status =true;
				}
			}
				while (status);
				System.out.print("Enter address: ");
				address = scanner.nextLine();
				System.out.print("Enter salary: ");
				salary = Double.parseDouble(scanner.nextLine());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", gender=" + gender + ", email=" + email
				+ ", address=" + address + ", salary=" + salary + "]";
	}
}
