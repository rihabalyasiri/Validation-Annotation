package com.example.demo.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

public class Student {
	@NotNull
	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String favoriteHobby;
	
	
	
	public Student() {
		
		this.countryOptions = new HashMap<>();
		countryOptions.put("IQ", "Irak");
		countryOptions.put("DE", "Deutschland");
		countryOptions.put("FR", "Frankreich");
		countryOptions.put("SP", "Spanien");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getFavoriteHobby() {
		return favoriteHobby;
	}
	public void setFavoriteHobby(String favoriteHobby) {
		this.favoriteHobby = favoriteHobby;
	}
	
	
	
	

}
