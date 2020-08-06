
package Lesson05;

public class Lesson05 {
	public static void main(String[] args) {
		PhanSo p1=new PhanSo(5,6); //p1=5/6
		p1.show();
		p1.congPhanSoVoiMotSo(2);
		p1.show();//p1=17/6
		PhanSo p2=new PhanSo(2,5);//p2=2/5
		p1.congPhanSoVoiMotPhanSo(p2);//17/6+2/5
		p1.show();
		p1.rutGonPhanSo();
		p1.show();
	}
}
		//		Person p1 = new Person("Thangg", 24);
		//		p1.say();
		//		Person p2 = new Person();
		//		p2.name = "Minh";
		//		p2.age = 21;
		//////		p2.say();
		////System.out.println(Person.kind);
		//Person p1=new Person("Thang",21);
		////System.out.println(p1.name);
		////
		////Person p2 = new Person ("Thien",22);
		////System.out.println(p2.name);
		//Person a = p1.A();
		//a.say();
		// EX: tao class Phanso
		// Phanso gom: tuso, mauso
		// method
		// + void congPhanSo(int x)
		// +void truPhanSo(Phanso p)
		// + Phan so rutGonPhanSo (PhanSo p)
		//+ void showPhanSo
