package _Q2_Book_Reading_System_LLD;

public class Book {
	String name;
	String author;
	String publicationDate;
	int ISBN;
	Member currentReader;
	
	public void setReader(Member member) {
		//When a new user starts reading we have set the name here as well
		this.currentReader = member;
	}
	
	public boolean isRead() {
		//Tells if the book is currently been read by any user
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
}
