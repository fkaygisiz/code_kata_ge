package org.echocat.kata.java.part1.model;

public class WrittenMedia {

	protected String title;
	protected String isbn;
	protected String[] authors;

	public WrittenMedia(String title, String isbn, String[] authors) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
	}


	public WrittenMedia() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

}