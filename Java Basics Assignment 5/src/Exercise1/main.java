package Exercise1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle R = new Rectangle();
		Circle C = new Circle();
		Triangle T = new Triangle();
		
		System.out.println("=====Calculator Shape Progarmer=====");

		System.out.println("Please input side width of Rectangle: ");
		R.setWidth(sc.nextDouble());
		System.out.println("Please input side length of Rectangle: ");
		R.setLength(sc.nextDouble());

		System.out.println("Please input radius of circle: ");
		C.setRadius(sc.nextDouble());

		System.out.println("Please input side A of Triangle: ");
		T.setSideA(sc.nextDouble());
		System.out.println("Please input side B of Triangle: ");
		T.setSideB(sc.nextDouble());
		System.out.println("Please input side C of Triangle: ");
		T.setSideC(sc.nextDouble());

		R.printResult();
		C.printResult();
		T.printResult();
	}
}
