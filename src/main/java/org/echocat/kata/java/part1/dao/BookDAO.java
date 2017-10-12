package org.echocat.kata.java.part1.dao;

import java.util.stream.Collectors;

import org.echocat.kata.java.part1.model.Book;

public class BookDAO extends WrittenMediaDAO {

	public BookDAO(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	public void initialize() {
		// List<String[]>authorFields = ﻿title;isbn;authors;description
		items = lines.stream().map(s -> {
			String[] vals = s.split(";");
			return new Book(vals[0], vals[1], vals[3], vals[2].split(","));
		}).collect(Collectors.toList());
	}

//	public void getAll() {
//		List<String> readCsvFiles = readData();
//		readCsvFiles.forEach(System.out::println);
//
//	}
}
