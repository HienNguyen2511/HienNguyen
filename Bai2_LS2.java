package Bai2_LS2;

import java.util.Scanner;

public class Bai2_LS2 {

   public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Cac phan tu o vi tri chan: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("");
        System.out.print("Cac phan tu o vi tri le: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.print("Cac phan tu chia het cho 2: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.print("Cac phan tu chia 5 du 1: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 5 == 1) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac so chan: " + sum);
    }
}