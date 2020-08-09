package exercise;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arrayInt = { 1, 2, 3, 4, 5 };
//arrayInt[0] = 1
//arrayInt[1] = 2
//arrayInt[2] = 3
//arrayInt[3] = 4
//arrayInt[4] = 5
		System.out.println("Array length: " + arrayInt.length);
		System.out.println("Elemant at index 3 is: " + arrayInt[3]);
//Do độ dài của mảng là 5 nên mảng có 5 phần tử từ a[0] đến a[4] 
//nên khi in phần tử thứ 5 của mảng arrayInt[5]thì sẽ không in được vì không có a[5]
	}
}
