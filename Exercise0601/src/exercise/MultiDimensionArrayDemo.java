package exercise;

public class MultiDimensionArrayDemo {
	public static void main(String[]args) {
String[][] matrix = {{"1","2"},{"3","4"}};

//matrix[0][0] = 1
//matrix[0][1] = 2
//matrix[1][0] = 3
//matrix[1][1] = 4

System.out.println("Element at second row and first column is: " + matrix [1][0]);
System.out.println("Number of rows: " + matrix.length);
System.out.println("Number of columns: " + matrix[0].length);

}
}
