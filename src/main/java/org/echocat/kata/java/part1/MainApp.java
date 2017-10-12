package org.echocat.kata.java.part1;

import java.util.List;

import org.echocat.kata.java.part1.model.WrittenMedia;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class MainApp {

    public static void main(String[] args) {
    	
    	DAO ad = new AuthorDAO("org/echocat/kata/java/part1/data/authors.csv");
    	ad.getAll();
    	DAO bd = new BookDAO("org/echocat/kata/java/part1/data/books.csv");
    	List<WrittenMedia> books = bd.getAll();
    	
    	DAO md = new MagazineDAO("org/echocat/kata/java/part1/data/magazines.csv");
    	List<WrittenMedia> magaazines = md.getAll();
    	books.addAll(magaazines);
    	
    	
//    	try {
//			//FileReader.readCsvFiles("org/echocat/kata/java/part1/data/books.csv");
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        System.out.println(getHelloWorldText());
    }


	protected static String getHelloWorldText() {
        return "Hello world!";
    }

}
