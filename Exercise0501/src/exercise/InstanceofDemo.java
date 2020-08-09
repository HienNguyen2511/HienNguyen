package exercise;

public class InstanceofDemo{
public static void main (String [] args ) {
	Parent obj1 = new Parent();
	Parent obj2 = new Child ();
	System.out.println ("obj1 instanceof Parent: " + (obj1 instanceof Parent));	//1
	System.out.println("obj1 instanceof Child: "+(obj1 instanceof Child));	//2
	System.out.println ("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface)); //3
	
	System.out.println ("obj2 instanceof Parent: " + (obj2 instanceof Parent));	//4	
	System.out.println ("obj2 instanceof Children: " + (obj2 instanceof Child));	//5	
	System.out.println ("obj1 instanceof MyInterface: " + (obj2 instanceof MyInterface));	//6
}
}
//Theo OOP trong Java thì mỗi lớp con kế thừa 1 và chỉ 1 lớp cha (implement) 
//Vậy nên khi chạy file InstanceofDemo thì toán tử instanceof sẽ kiểm tra đối tượng mà nó so sánh thể hiện với kiểu dữ liệu

//Ví dụ tại 1 kết quả sẽ là true vì obj1 = Parent thuộc lớp Parent
//Còn tại 2 và 3 thì kết quả là false do obj1 = Parent thuộc lớp ngoài của Child (Parent là lớp cha của Chid)
//Tương tự tại 4 5 6 thì kết quả sẽ là true do obj2 = Child là con của Parent thực thi trên lớp MyInterface 