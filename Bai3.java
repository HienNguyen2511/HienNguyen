/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW3;

import java.util.Scanner;

/**
 *
 * @author HienNguyen
 */
public class Bai3 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i[] = new Integer[10];
        for (int j = 0; j < 10; j++) {
            System.out.println("Nhap so thu " + (j + 1) + ": ");
            i[j] = sc.nextInt();
        }
        int imax = i[0];
        int imin = i[0];
        for (int j = 0; j < 10; j++) {
            if (imax < i[j]) {
                imax = i[j];
            }
        }
        for (int j = 0; j < 10; j++) {
            if (imin > i[j]) {
                imin = i[j];
            }
        }
        System.out.println("Max " + imax);
        System.out.println("Min: " + imin);
    }

}
