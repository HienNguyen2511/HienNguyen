package Exercise1;

public class Operator {

	private char operator;

	public char getOperator() {
		return operator;
	}

	public Operator(char x) {
		this.operator = x;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public double Cong(double a, double b) {
		return a + b;
	}

	public double Tru(double a, double b) {
		return a - b;
	}

	public double Nhan(double a, double b) {
		return a * b;
	}

	public double Chia(double a, double b) {
		return a / b;
	}

	public double Mu(double a, double b) {
		return Math.pow(a, b);
	}

}
