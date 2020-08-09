package exercise.forloop;

//Write a program called HarmonicSum to compute the sum of a harmonic series
//as shown below, where n=50000. The program shall compute the sum from left-to-right 
//as well as from the right-to-left. Are the two sums the same? Obtain the absolute 
//difference between these two sums and explain the difference. Which sum is more accurate?.
public class HarmonicSum {
public static void main(String []args) {
	int n=50000;
	double sumL2R = printLeftToRightSum(n);
	double sumR2L = printRightToLeftSum(n);
	double difference = sumL2R-sumR2L;
	System.out.printf("Difference: %.15f", difference);
	System.out.println();
}

private static double printLeftToRightSum(int n) {
	double sum =0.0;
	for(int i=1;i<=n;i++) {
		sum +=(double)1/i;
	}
	System.out.printf("Left to right harmonic sum %.15f ",sum);
	System.out.println();
	return sum;
}

private static double printRightToLeftSum(int n) {
	double sum=0.0;
	for(int i =n;i>=1;i--) {
		sum += (double)1/i;
	}
	System.out.printf("Right to left harmonic sum %.15f", sum);
	System.out.println();
	return sum;
}
}
//Hai kết quả của phép tính trên là khác nhau 
//Khi duyệt từ trái sang phải thì i tăng dần từ 1 đế n 
//Khi đó sai số của phép chia 1/i sẽ rất nhỏ so với việc
//duyệt từ n đến i. 
//Vì vậy kết quả của duyệt từ trái sang phải sẽ chính xác hơn
