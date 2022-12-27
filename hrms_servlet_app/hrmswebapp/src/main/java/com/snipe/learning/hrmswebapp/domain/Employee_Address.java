package com.snipe.learning.hrmswebapp.domain;

public class Employee_Address {
	private String house_no;
	private String street_no;
	private String colony;
	private String locality;
	private long pin_code;
	private String city;
	private String state;
	private String country;
	
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getStreet_no() {
		return street_no;
	}
	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public long getPin_code() {
		return pin_code;
	}
	public void setPin_code(long pin_code) {
		this.pin_code = pin_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee_Address [house_no=" + house_no + ", street_no=" + street_no
				+ ", colony=" + colony + ", locality=" + locality + ", pin_code=" + pin_code + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
}
