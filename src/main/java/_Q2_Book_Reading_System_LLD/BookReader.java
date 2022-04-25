package _Q2_Book_Reading_System_LLD;

import java.util.List;

public class BookReader {
	
	private List<Member> listOfMembers;
	private List<Book> listOfBooks;
	
	public void addMember(Member member) {
		listOfMembers.add(member);
	}
	
	public static Book getBook(String name) {
		//Book finding logic
		return null;
	}
	
	private boolean isAvailable() {
		//private because it will be called by the login method
		
		//Returns true if no one else is reading the book
		//since only one person can read the book at a time
		return true;
	}
	
	public Member login(String username, String password) {
		if(isAvailable()) {
			
			//Search for the logged in member and return his account 
			//Run the authentication logic...
			Member member = listOfMembers.get(0);
			
			//login successfully
			System.out.println("Welcome, " + member);
			
			return member;
			
		} 
		//Returns null if someone else is reading a book already
		return null;
	}
	
	public Admin adminLogin(String username, String password) {
		//Authentication logic here...
		return Admin.getUniqueInstance();
	}
	
	public boolean isAdminLoggedIn() {
		return true;
	}
	
	public void addBook(Book book, Admin admin) {
		if(isAdminLoggedIn()) {
			this.listOfBooks.add(book);
			System.out.println("Book added successfully");
		}
	}
}
