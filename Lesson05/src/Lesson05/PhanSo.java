package Lesson05;

//public class Person {
//		//	static String kind  = "Nguoi"; //type: class variable
//		//	String name; //Object Variable
//		//	int age;
//		//
//		//	public Person() {
//		//		System.out.println("Chay ham khoi dao default");
//		//	}
//		//
//		//	public Person(String name, int age) {
//		//		this.name=name;
//		//		this.age=age;
//		//	}
//		//
//		//	public void say() {
//		//		System.out.println("My name is " + name);
//		//		System.out.println("I am " + age + "years old");
//		//	}
//		//	public Person A() {
//		//		Person returnValue = new Person("demo",200);
//		//				return returnValue;
//		//	}
//
//}
public class PhanSo {
	int tuso;
	int mauso;
	public void Phanso() {
	}
	public PhanSo(int tuso, int mauso){
		this.tuso=tuso;
		this.mauso=mauso;
		System.out.println(tuso + "/" + mauso);
	}
	public void show() {
		System.out.println(this.tuso + "/" + this.mauso);
	}
	void congPhanSoVoiMotSo(int x) {
		this.tuso = this.tuso + this.mauso * x;
	}
	void congPhanSoVoiMotPhanSo(PhanSo p) {
		this.tuso =this.tuso*p.mauso + p.tuso*this.mauso;
		this.mauso =this.mauso*p.mauso;
	}
	void rutGonPhanSo(){
		int smaller = this.tuso;
		if(this.tuso > this.mauso) {
			smaller = this.mauso;
		}
		int UCLN =1;
		for(int i=smaller;i>0;i--) {
			if(this.tuso % i ==0 && this.mauso %i==0) {
				UCLN =i;
				break;
				}
			this.tuso /= UCLN;
			this.mauso /=UCLN;
			}
		}
	}

	
