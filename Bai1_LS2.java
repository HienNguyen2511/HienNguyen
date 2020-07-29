package Bai1_LS2;

import java.util.Scanner;

public class Bai1_LS2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Import n: ");
        int x = sc.nextInt();
        System.out.println("Import x: ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            {
                while (i % 2 == 1) {
                    array[i] = -1;
                    System.out.print(array[i]);
                }
            }
            {
                int max = array[0];
                if (array[i] > max) {
                    max = array[i];
                } else {
                    max = array[0];
                }
                System.out.print(max);
            }
            {
                int min = array[0];
                if (array[i] < min) {
                    min = array[i];
                } else {
                    min = array[0];
                }
                min = -1;
                System.out.print(min);
            }
            {
                while (array[i] < x) {
                    System.out.print(array[i]);
                }
            }
            {
                float y[] = new float[n];
                y[i] = x / array[i];
                if (y[i] < y[i + 1]) {
                    System.out.print("Gia tri la: " + array[i + 1]);
                } else {
                    System.out.print("Gia tri la: " + array[i]);
                }
            }
            {
                while (n % 2 == 1) {
                    for (int z = n - 1; z < n && z >= ((n - 1) / 2); z--) {
                        array[i] = array[i + z];
                        System.out.println("Day so la doi xung");

                        System.out.println("Day so khong la doi xung");
                    }
                }
            }
        }
    }
}
