/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author HienNguyen
 */
public class Ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Import number: ");
        input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            if(i == input){
                System.out.println(i+".");
                break;
            }
            if (input % i == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
