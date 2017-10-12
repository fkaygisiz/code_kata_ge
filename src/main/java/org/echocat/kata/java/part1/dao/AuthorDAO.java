package org.echocat.kata.java.part1.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.echocat.kata.java.part1.model.Author;

public class AuthorDAO extends DAO<Author> {

	// List<Author> items = new ArrayList<Author>();

	public AuthorDAO(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public String find(String email) {
		
		
		return null;
	}

	public void initialize() {
		// List<String[]>authorFields =
		items = lines.stream().map(s -> {
			String[] vals = s.split(";");
			return new Author(vals[0], vals[1], vals[2]);
		}).collect(Collectors.toList());
	}

}
