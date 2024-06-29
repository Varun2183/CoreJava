package com.tnsif.multilevel;

public class State extends Country {

	private String StateName;
	private int DistrictNo;
	private String StateCapital;
	
	public State() {
		super();
	}
	
	public State(String contName, int noOfCountries, float contSize, String CountryName, int NoOfStates,
			String Capital,String StateName,int DistrictNo,String StateCapital) {
		super(contName, noOfCountries, contSize, CountryName, NoOfStates, Capital);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "State [StateName=" + StateName + ", DistrictNo=" + DistrictNo + ", StateCapital=" + StateCapital
				+ ", toString()=" + super.toString() + ", getCountryName()=" + getCountryName() + ", getNoOfStates()="
				+ getNoOfStates() + ", getCapital()=" + getCapital() + ", getContName()=" + getContName()
				+ ", getNoOfCountries()=" + getNoOfCountries() + ", getContSize()=" + getContSize() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getStateName() {
		return StateName;
	}

	public void setStateName(String stateName) {
		StateName = stateName;
	}

	public int getDistrictNo() {
		return DistrictNo;
	}

	public void setDistrictNo(int districtNo) {
		DistrictNo = districtNo;
	}

	public String getStateCapital() {
		return StateCapital;
	}

	public void setStateCapital(String stateCapital) {
		StateCapital = stateCapital;
	}
	
	
}
