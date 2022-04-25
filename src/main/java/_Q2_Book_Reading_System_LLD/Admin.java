package _Q2_Book_Reading_System_LLD;

import java.util.List;

public class Admin {
	
	private List<Member> listOfMembers;
	private List<Book> listOfBooks;
	private static Admin admin = new Admin();
	private String username;
	private String password;
	
	private Admin() {}
	
	public static Admin getUniqueInstance() {
		return admin;
	}
	
	public List<Member> viewMembers() {
		return this.listOfMembers;
	}


}
