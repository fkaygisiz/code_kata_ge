package org.echocat.kata.java.part1.dao;

import java.util.stream.Collectors;

import org.echocat.kata.java.part1.model.Magazine;

public class MagazineDAO extends WrittenMediaDAO {

	public MagazineDAO(String fileName) {
		super(fileName);
	}

	
	public void initialize() {
		// List<String[]>authorFields = title	isbn	authors	publishedAt, 

		items = lines.stream().map(s -> {
			String[] vals = s.split(";");
			return new Magazine(vals[0], vals[1], vals[2].split(","), vals[3]);
		}).collect(Collectors.toList());
	}
}
