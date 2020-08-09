package Exercise1;

import java.util.Scanner;

public class main {
	private static final String String = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double c1, c2;
		while (true) {
			System.out.println("=========Calculator Program=========");
			System.out.println("1. Normal Calculator ");
			System.out.println("2. BMI Calculator ");
			System.out.println("3. Exit ");
			System.out.print("Please choice one option: ");

			int choose = sc.nextInt();
			switch (choose) {

			case 1:
				char x;
				System.out.print("Enter number: ");
				int a = sc.nextInt();
				String s;

				do {
					System.out.print("Enter Operator :");
					s = sc.next();
					x = s.charAt(0);
				} while (x != '*' && x != '+' && x != '-' && x != '/' && x != '^' || s.length() != 1);

				System.out.print("Enter number: ");
				double b = sc.nextDouble();
				System.out.print("Memory: " + new NorBMI().calculate(a, new Operator(x), b) + "\n");
				double p = (double) new NorBMI().calculate(a, new Operator(x), b);

				System.out.println("Please input (+, -, *, /, ^) ");
				do {
					System.out.print("Enter Operator :");
					s = sc.next();
					x = s.charAt(0);
				} while (x != '*' && x != '+' && x != '-' && x != '/' && x != '^' || s.length() != 1);
				System.out.print("Enter number: ");
				double c = sc.nextDouble();
				System.out.print("Memory: " + new NorBMI().calculate(p, new Operator(x), c) + "\n");
				System.out.print("Result: " + new NorBMI().calculate(p, new Operator(x), c));
				break;

			case 2:
				try {
					System.out.println("Enter Weight (kg): ");
					c1 = sc.nextDouble();
					System.out.println("Enter Height (cm): ");
					c2 = sc.nextDouble();
					new CalBMI(c1, c2);
				} catch (NumberFormatException e) {
					System.out.print(e);
				}

				break;

			case 3:

				return;

			default:

				break;
			}

		}

	}
}
