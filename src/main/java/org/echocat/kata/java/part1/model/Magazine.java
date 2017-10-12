package org.echocat.kata.java.part1.model;

import java.util.Arrays;
import java.util.Date;

public class Magazine extends WrittenMedia{
	
	private String publishedAt;

	public Magazine(String title, String isbn, String[] authors, String publishedAt) {
		super(title, isbn, authors);
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	@Override
	public String toString() {
		return "Magazine [publishedAt=" + publishedAt + ", title=" + title + ", isbn=" + isbn + ", authors="
				+ Arrays.toString(authors) + "]";
	}
}
