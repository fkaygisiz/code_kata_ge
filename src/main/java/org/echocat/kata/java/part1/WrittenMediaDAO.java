package org.echocat.kata.java.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.echocat.kata.java.part1.model.WrittenMedia;

public abstract class WrittenMediaDAO extends DAO<WrittenMedia> {

	public WrittenMediaDAO(String fileName) {
		super(fileName);
	}

	public List<WrittenMedia> findByAuthorEmail(String email) {
		
		return items.stream().filter(s->
			Arrays.asList(s.getAuthors()).stream().
			filter(a->a.equalsIgnoreCase(email))
			.collect(Collectors.toList()).size()>0).collect(Collectors.toList());
	}
	
	public List<WrittenMedia> findByIsbn(String isdn) {
		
		return items.stream().
			filter(a->a.getIsbn().equalsIgnoreCase(isdn)).collect(Collectors.toList());
	}

}
