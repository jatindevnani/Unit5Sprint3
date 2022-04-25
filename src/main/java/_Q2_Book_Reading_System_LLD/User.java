package _Q2_Book_Reading_System_LLD;

import java.util.Date;

public abstract class User {
	
	//No login details required for non members
	private String name;
	Address address;
	
	Book searchBooks(String name) {
		//Returns the book searched by the user
		Book book = BookReader.getBook(name);
		return book;
	}
	
	public Member register(int membershipAmount, Date registrationDate, String newUsername, String newPassword) {
		
		//If the user registers than we keep his old data
		//and provide him his new username and password for his membership
		Member member = (Member)this;
		member.setJoinDate(registrationDate);
		member.setPassword(newPassword);
		member.setUsername(newUsername);
		return member;
	}
 }	


class Address {
	private String city;
	private String state;
	private int pincode;
	
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}