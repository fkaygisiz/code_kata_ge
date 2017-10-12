package org.echocat.kata.java.part1.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.echocat.kata.java.part1.MainApp;

public class FileReader {

	private String fileName;

	public FileReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public List<String> readCsvFiles() throws URISyntaxException, IOException {
		Path path = Paths.get(MainApp.class.getClassLoader().getResource(this.fileName).toURI());

		List<String> list = new ArrayList<String>();
		Stream<String> lines = Files.lines(path).skip(1);
		list = lines.filter(line -> !line.trim().equals("")).collect(Collectors.toList());

		lines.close();
		return list;
	}

}
