package exercise.whileloop;

//Write a program called Fibonacci to print the first 20 Fibonacci numbers F(n)
//where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1
//Also compute their average. The output shall look like:

//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5
public class Fibonacci {
	public static void main(String[] args) {
		int n = 1;
		int F1 = 1;
		int F2 = 1;
		int nMax = 20;
		int sum = F1 + F2;
		double average;
		System.out.println("The first " + nMax + " Fibonacci number are: \n");
		while (n <= nMax) {
			System.out.print(F1 + " ");
			sum = F1 + F2;
			F1 = F2;
			F2 = sum;
			++n;
		}
		average = sum / nMax;
		
		System.out.println("\n\nThe average is " + average);

	}
}
