package exercise;

public class ArithmeticDemo {
	
	public static void main(String[] args) {
		//Khi thực hiện toán tử "+" với kiểu boolean thì ta phải tạo thêm 1 public static boolean cho nó  
		//để kiểm tra biến khởi tạo result là dạng double hay là dạng int 
		double result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		
		// Để truyền kết quả cho result ta thay đổi giá trị biến ban đầu khai báo
		// Ví dụ:
		// double result = 1+2;
		// Ta thay bằng:
		// double result = 2 +3;
		// Khi đó các giá trị của result khi thực hiện các toán tử -,*,/,% sẽ tự thay
		// đổi theo giá trị biến khai báo

		double original_result = result;
		String firstString = "This is";
		String secondString = "a concatenated string.";

		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		result = result - 1;
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;

		result = result * 2;
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;

		result = result / 2;
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;

		result = result % 7;
		System.out.println(original_result + " % 7 = " + result);
		original_result = result;

	}
}
