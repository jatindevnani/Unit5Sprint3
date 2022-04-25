package _Q2_Book_Reading_System_LLD;

import java.util.Date;

public class Member extends User{
	private String username;
	private String password;
	private Date joinDate;
	private int membershipLeft;
	private boolean isReading;
	private Book currentRead;
	
	
	public boolean isReading() {
		//Tells if the user is reading a book or not
		//true if reading
		//false if not reading 
		return isReading;
	}
	
	public Book currentlyReading() {
		//Returns the book the user is currently reading
		return currentRead;
	}
	
	public void startReading(Book book) {
		//If the user is currently reading any other book he cannot start another read at the same time
		if(this.isReading()) {
			System.out.println("Already reading another book");
			return;
		}
		
		this.isReading = false;
		this.currentRead = book;
		
		
		System.out.println("Started reading " + book.getName());
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
		membershipLeft = 365;
	}
	
	public void extendMembership(int duration) {
		this.membershipLeft+=duration;
	}
 }
