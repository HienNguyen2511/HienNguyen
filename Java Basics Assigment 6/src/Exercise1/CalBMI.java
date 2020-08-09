package Exercise1;

public class CalBMI {
	public double weight;
	public double height;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public CalBMI() {
	}

	public CalBMI(double weight, double height) {

		this.height = height;
		this.weight = weight;
		double c = this.weight / Math.pow(this.height, 2);
		System.out.print("BMI Number: " + c + "\n");
		if (c < 19) {
			System.out.println("BMI Status: Duoi chuan");
		} else if (c >= 19 && c < 25) {
			System.out.println("BMI Status: Chuan");
		} else if (c >= 25 && c < 30) {
			System.out.println("BMI Status: Thua can");
		} else if (c >= 30 && c < 40) {
			System.out.println("BMI Status: Beo-nen giam can");
		} else {
			System.out.println("BMI Status: Rat beo - can giam can ngay");
		}
	}
}
