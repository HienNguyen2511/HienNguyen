package Lesson05;

public class Complex {
	float thuc;
	float ao;

	public void Complex() {
	}

	public Complex() {
	}

	public Complex(float thuc) {
		this.thuc = thuc;
	}

	public Complex(float thuc, float ao) {
		this.thuc = thuc;
		this.ao = ao;
		this.show();
	}

	public void show() {
		System.out.println((this.thuc) + " + " + (this.ao) + "i");
	}

	public Complex congSoPhuc(Complex p1, Complex p2) {
		Complex p3 = new Complex();

		p3.thuc = p1.thuc + p2.thuc;
		p3.ao = p1.ao + p2.ao;
		return p3;
	}

	public Complex hieuSoPhuc(Complex p1, Complex p2) {
		Complex p3 = new Complex();

		p3.thuc = p1.thuc - p2.thuc;
		p3.ao = p1.ao - p2.ao;
		return p3;
	}

	public Complex nhanSoPhuc(Complex p1, Complex p2) {
		Complex p3 = new Complex();
		p3.thuc = p1.thuc * p2.thuc + p1.ao * p2.ao;
		p3.ao = p1.thuc * p2.ao + p1.ao * p2.thuc;
		return p3;
	}

	public Complex chiaSoPhuc(Complex p1, Complex p2) {
		Complex p3 = new Complex();
		p3.thuc = (p2.thuc * p1.thuc + p2.ao * p1.ao) / (p2.thuc * p2.thuc + p2.ao * p2.ao);
		p3.ao = (p2.thuc * p1.ao - p2.ao * p1.thuc) / (p2.thuc * p2.thuc + p2.ao * p2.ao);
		return p3;
	}

	public static void main(String[] args) {
		System.out.print("p1 = ");
		Complex p1 = new Complex(3, 10);

		System.out.print("p2 = ");
		Complex p2 = new Complex(4, 5);

		System.out.print("Tong la: ");
		new Complex().congSoPhuc(p1, p2).show();

		System.out.print("Hieu la: ");
		new Complex().hieuSoPhuc(p1, p2).show();

		System.out.print("Tich la: ");
		new Complex().nhanSoPhuc(p1, p2).show();

		System.out.print("Thuong la: ");
		new Complex().chiaSoPhuc(p1, p2).show();

	}
}
