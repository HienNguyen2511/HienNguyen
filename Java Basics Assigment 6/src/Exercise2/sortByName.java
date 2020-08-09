package Exercise2;

import java.util.Comparator;

public class sortByName implements Comparator<EastAsiaCountries> {

	@Override
	public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
		return o1.getCountryName().compareTo(o2.getCountryName());
	}

}
