package Exercise1;

import java.util.Scanner;

public class NorBMI {
	static Scanner sc = new Scanner(System.in);

	public double calculate(double a, Operator operator, double b) {

		if (operator.getOperator() == '+') {
			return operator.Cong(a, b);
		}
		if (operator.getOperator() == '-') {
			return operator.Tru(a, b);
		}
		if (operator.getOperator() == '*') {
			return operator.Nhan(a, b);
		}
		if (operator.getOperator() == '/') {
			try {
				return operator.Chia(a, b);
			} catch (ArithmeticException y) {
				System.out.println(y);
			}
		}
		return operator.Mu(a, b);
	}

}
