package fa.training.test;
import fa.training.entities.Employee;
public class Test {
public static void main(String[] args) {
	Employee[] employees = new Employee[5];
	System.out.println("1. Creat employee: ");
	for(int i=0;i<employees.length;i++) {
		System.out.println("Enter empolyee ["+(i+1)+"]: ");
		employees[i] = new Employee();
		employees[i].input();
	}
	System.out.println("2. Display emplyee's salary >= 1000: ");
	for(int i=0;i<employees.length;i++) {
		if(employees[i].getSalary() >= 1000) {
			System.out.println(employees[i]);
		}
	}
}
}
