package org.echocat.kata.java.part1;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.echocat.kata.java.part1.model.WrittenMedia;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class MainApp {

    public static void main(String[] args) {
    	
    	DAO ad = new AuthorDAO("org/echocat/kata/java/part1/data/authors.csv");
    	ad.getAll();
    	WrittenMediaDAO bd = new BookDAO("org/echocat/kata/java/part1/data/books.csv");
    	List<WrittenMedia> books = bd.getAll();
    	
    	WrittenMediaDAO md = new MagazineDAO("org/echocat/kata/java/part1/data/magazines.csv");
    	List<WrittenMedia> magaazines = md.getAll();
    	books.addAll(magaazines);
    	
    	
    	Scanner scanner = new Scanner(System.in);

    	System.out.println("Search by email : 1");
    	System.out.println("Search by isbn : 2");
    	System.out.print("What do you want to do :");

        // get their input as a String
        int a = scanner.nextInt();
        

        if(a == 1) {
        	System.out.print("Write email :");
            String email = scanner.next();
            List<WrittenMedia> findByAuthorEmail = bd.findByAuthorEmail(email);
            findByAuthorEmail.addAll(md.findByAuthorEmail(email));
            
            findByAuthorEmail.stream().sorted(Comparator.comparing(WrittenMedia::getTitle)).forEach(System.out::println);
        }
        else if(a == 2) {
        	System.out.print("Write isbn :");
        	String isbn = scanner.next();
            List<WrittenMedia> findByIsbn = bd.findByIsbn(isbn);
            findByIsbn.addAll(md.findByAuthorEmail(isbn));
            
            findByIsbn.stream().sorted(Comparator.comparing(WrittenMedia::getTitle)).forEach(System.out::println);
        }
        // prompt for their age

        
        
    	
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
