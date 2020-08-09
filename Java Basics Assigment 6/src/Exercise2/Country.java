package Exercise2;

public class Country {
	
	protected String countryCode;
	protected String countryName;
	protected float totalArea;

	public Country() {
	}

	public Country(String countryCode, String countryName, float totalArea) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.totalArea = totalArea;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public float getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(float totalArea) {
		this.totalArea = totalArea;
	}

	public void display() {
		System.out.println("CountryCode : " + this.countryCode);
		System.out.println("CountryName :" + this.countryName);
		System.out.println("TotalArea :+" + this.totalArea);
	}
}
