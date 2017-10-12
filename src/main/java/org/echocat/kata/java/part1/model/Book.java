package org.echocat.kata.java.part1.model;

import java.util.Arrays;

public class Book extends WrittenMedia {

	private String description;

	public Book(String title, String isbn, String description, String[] authors) {
		super(title,isbn, authors);
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [description=" + description + ", title=" + title + ", isbn=" + isbn + ", authors="
				+ Arrays.toString(authors) + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
