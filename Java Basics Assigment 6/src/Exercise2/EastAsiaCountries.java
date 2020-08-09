package Exercise2;

public class EastAsiaCountries extends Country {
	private String countryTerrain;

	public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
		super(countryCode, countryName, totalArea);
		this.countryTerrain = countryTerrain;

	}

	public String getCountryTerrain() {
		return countryTerrain;
	}

	public void setCountryTerrain(String countryTerrain) {
		this.countryTerrain = countryTerrain;
	}

	public void display() {
		super.display();
		System.out.println("CountryTerrain :" + this.getCountryTerrain());
	}

}
