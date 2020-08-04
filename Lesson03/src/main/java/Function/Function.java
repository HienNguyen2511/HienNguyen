/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author HienNguyen
 */
public class Function {

    public static void main(String[] args) {
//        System.out.println("Hello");
//        A();
//        hamCoGiaTriTruyenVao(5);
//        int[] a = hamCoGiaTriTraVe();
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        int tong = sum(3, 4);
//        System.out.println(tong);

        // viet 1 ham dau vao la 1 so, dau ra 
    // la true neu so do la so chan, false
    // neu so do la so le
    //- su dung ham do trong main()
        System.out.println(random(7));
    }

    public static void A() {
        System.out.println("Ham A da chay!");
    }

    // input, output
    public static void hamCoGiaTriTruyenVao(int input) {
        System.out.println("Nguoi dung nhap:" + input);
    }

    //output
    public static int[] hamCoGiaTriTraVe() {
        int[] returnArr = {1, 2, 3, 4};
        return returnArr;
    }

    // 
    public static int sum(int st1, int st2) {
        System.out.println("Thuc hien phep cong");
        int sum = st1 + st2;
        return sum;
    }//

    
    public static int random(int num) {
        return (int) (Math.random() * num);
    }

}