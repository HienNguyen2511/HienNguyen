package exercise.forloop;

//Write a program called AverageArray to initialization an int array
//after that found average of this array and display the average.

public class AverageArray {
	public static void main(String[] args) {
		int[] intArr = { 12, 5, 9, 8, 11, 86 };
		int sum = 0;
		double average = 0.0d;
		int length = intArr.length;

		for (int i = 0; i < length; i++) {
			sum += intArr[i];
		}
		average = sum / length;

		System.out.println("Average of element in inAraay: " + average);
	}
}
