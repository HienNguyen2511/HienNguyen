
package Bai2_LS3;

public class Bai2_LS3 {

    public static void main(String[] args) {
        boolean bool = kiemTraChiaHetCho3Va5 (20, 25);
        System.out.println(bool);
    }

    public static boolean kiemTraChiaHetCho3Va5(int input1, int input2) {
        int sum = input1 + input2;
        if (sum % 3 == 0 && sum % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

}