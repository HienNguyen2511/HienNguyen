package Exercise1;

public class Triangle extends Shape {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {

	}

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public void printResult() {
		System.out.println("------Triangle------");
		System.out.println("side A: " + this.sideA);
		System.out.println("side B: " + this.sideB);
		System.out.println("side C: " + this.sideC);
		System.out.println("Area :" + this.getArea());
		System.out.println("Perimeter :" + this.getPerimeter());
	}

	@Override
	public double getPerimeter() {
		double p = (sideA + sideB + sideC) / 2;
		return (double) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	@Override
	public double getArea() {
		return (sideA + sideB + sideC) / 2;
	}
}
