package Exercise2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;

public class main {
	private static EastAsiaCountries eac;
	static Scanner sc = new Scanner(System.in);
	private static ArrayList<EastAsiaCountries> list = new ArrayList<>();

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("				MENU								");
			System.out.println("=======================================================================");
			System.out.println("1. Input the information of 11 countries in East Asia");
			System.out.println("2. Display the information of countries you've just input");
			System.out.println("3. Search the information of country by user-entered name");
			System.out.println("4. Display the information of contries sorted name in ascending order");
			System.out.println("5. Exit");
			System.out.println("=======================================================================");

			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Enter code of country");
				String a1 = sc.next();
				System.out.println("Enter name of country");
				String a2 = sc.next();
				System.out.println("Enter total Area");
				Float f1 = sc.nextFloat();
				System.out.println("Enter terrain of country:");
				String a3 = sc.next();
				eac = new EastAsiaCountries(a1, a2, f1, a3);
				list.add(eac);
				break;
				
			case 2:
				eac.display();
				break;
			
			case 3:
				System.out.println("Enter the country name");
				String a4 = sc.next();
				if (main.Check(a4)) {
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getCountryName().equals(a4)) {
							list.get(i).display();
							break;
						} else {
							System.out.println("This country is not exsit");
						}
					}

				}
				
			case 4:
				ArrayList<EastAsiaCountries> clone = (ArrayList) list.clone();
				Collections.sort(clone, new sortByName());
				for (EastAsiaCountries eas : clone) {
					eas.display();
				}
				
			case 5:
				break;

			default:
				break;
			}
		}

	}

	public static boolean Check(String s) {
		for (EastAsiaCountries eas : list) {
			if (eas.getCountryName().equals(s)) {
				return true;
			}
		}
		return false;
	}
}
