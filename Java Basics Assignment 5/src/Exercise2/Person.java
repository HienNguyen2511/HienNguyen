package Exercise2;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Shopping program=======");
		Person.Wallet vow = new Person.Wallet(); // vow = value of wallet

		System.out.print("input number of bill: ");
		int nob = sc.nextInt(); // nob = number of bills

		int[] bills = new int[nob];
		for (int i = 0; i < bills.length; i++) {
			System.out.print("input value of bill " + (i + 1) + ": ");
			bills[i] = sc.nextInt();
		}
		System.out.print("input value of wallet: ");
		vow.setValue(sc.nextInt());

		Person total = new Person();// total = total of bills
		boolean check = new Wallet().payMoney(total.calcTotal(bills));

		System.out.println("This is total of bill: " + total.calcTotal(bills));

		if (check) {
			System.out.println("You can buy it.");
		} else {
			System.out.println("You can't buy it.");
		}

	}

	public int calcTotal(int[] bills) {
		int sum = 0;
		for (int i = 0; i < bills.length; i++) {
			sum += bills[i];
		}
		return sum;
	}

	static class Wallet {

		private int value;

		public int getValue() {
			return this.value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public boolean payMoney(int total) {
			if (total <= this.value) {
				return true;
			}
			return false;
		}
	}
}
