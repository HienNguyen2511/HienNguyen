package exercise;

public class UnaryDemo {
	public static void main(String[] args) {
		int i = 3;
		i += i++ + (++i) + (++i) + i++; // i = i + i++ +(++i) +(++i) + i++
		System.out.println(i);
//Giải thích: 
// i++ : i = 3 sau đó tăng giá trị lên 1 đơn vị thành 4 (1)
//++i: tăng 1 giá trị của i lên 1 đơn vị sau đó gán i bằng giá trị đó. Tức là i =5 (2)
//++i: Tương tự (2) => i =6
//i++: Tương tự (1) => i =6
//=> i = 3 + 3 + 5 + 6 + 6 = 23
	}
}