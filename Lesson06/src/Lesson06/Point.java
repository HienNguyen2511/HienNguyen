package Lesson06;


public class Point {

    double x, y, z;

    public Point() {
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void show() {
        System.out.println(x + "," + y + "," + z);
    }
public static void main(String[] args) {
	Point point =new Point (1,2,3);
	point.show();
}
}