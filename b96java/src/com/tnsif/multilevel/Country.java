package com.tnsif.multilevel;

public class Country extends Continent {

		private String CountryName;
		private int NoOfStates;
		private String Capital;
		
		

		public Country() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Country(String contName, int noOfCountries, float contSize,String CountryName,int NoOfStates,String Capital) {
			super(contName, noOfCountries, contSize);
			// TODO Auto-generated constructor stub
			this.CountryName=CountryName;
			this.NoOfStates=NoOfStates;
			this.Capital=Capital;
		}

		@Override
		public String toString() {
			return "Country [CountryName=" + CountryName + ", NoOfStates=" + NoOfStates + ", Capital=" + Capital
					+ ", toString()=" + super.toString() + ", getContName()=" + getContName() + ", getNoOfCountries()="
					+ getNoOfCountries() + ", getContSize()=" + getContSize() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}

		public String getCountryName() {
			return CountryName;
		}

		public void setCountryName(String countryName) {
			CountryName = countryName;
		}

		public int getNoOfStates() {
			return NoOfStates;
		}

		public void setNoOfStates(int noOfStates) {
			NoOfStates = noOfStates;
		}

		public String getCapital() {
			return Capital;
		}

		public void setCapital(String capital) {
			Capital = capital;
		}

		
}
