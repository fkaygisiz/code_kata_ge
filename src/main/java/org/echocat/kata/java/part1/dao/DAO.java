package org.echocat.kata.java.part1.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<T>{

	private FileReader fileReader;
	protected List<String> lines;
	protected List<T> items;

	
	public DAO(String fileName) {
		super();
		this.fileReader = new FileReader(fileName);
		lines = readData();
		initialize();
	}

	abstract void initialize();
	private List<String> readData() {
		try {
			return this.fileReader.readCsvFiles();
		} catch (URISyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<String>();
	}

	public  List<T> getAll() {
		return items;
	}
	
	
	
}
