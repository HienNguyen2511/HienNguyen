
package Bai3_LS3;

public class Bai3_LS3 {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4,5,6,7};
        int output = kiemTraSuSapXep(array);
        System.out.println(output);
    }

    public static int kiemTraSuSapXep(int[] array) {
        int kq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[i + 1]) {
                return kq = 1;
            } else if (array[i] >= array[i + 1]) {
                return kq = -1;
            } else {
                return kq = 0;
            }
        }
        return kq;
    }

}