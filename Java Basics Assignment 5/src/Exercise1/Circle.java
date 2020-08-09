package Exercise1;

public class Circle extends Shape {
	private double Radius;

	public Circle() {

	}

	public Circle(double Radius) {
		this.Radius = Radius;
	}

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double Radius) {
		this.Radius = Radius;
	}

	@Override
	public void printResult() {
		System.out.println("------Cirle-----");
		System.out.println("Radius :" + this.Radius);
		System.out.println("Area :" + this.getArea());
		System.out.println("Periemter :" + this.getPerimeter());
	}

	@Override
	public double getPerimeter() {
		double Pi = (double) Math.PI;
		double p = Pi * Radius * Radius;
		return p;
	}

	@Override
	public double getArea() {
		double Pi = (double) Math.PI;
		return 2 * Pi * Radius;
	}
}
