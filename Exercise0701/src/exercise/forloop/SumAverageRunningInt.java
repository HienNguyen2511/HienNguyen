package exercise.forloop;

//Write a program that sums the first 100 positive integers.


public class SumAverageRunningInt {
	public static void main(String[] args) {
		int sum = 0;
		int n = 100;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("SumAverageRunningInt: " + sum);
	}
}
