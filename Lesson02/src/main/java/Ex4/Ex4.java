package Ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Import Number: ");
        n = sc.nextInt();

        int[] array = new int[n];       //B2
        //int array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so thu " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Tong cac phan tu la: " + sum + ": ");
        System.out.println(" Day so la ");
        for (int i = 0; i < n; i++) {
            System.out.print( array[i] + " ");
        }
    }
}
