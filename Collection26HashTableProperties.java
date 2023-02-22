//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.*;
import java.io.*;
public class Collection26HashTableProperties {

	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();//properties object is created
		
		//Creating a FileInputStream to read the data from the file called "database.properties"
		FileInputStream fis = new FileInputStream("database.properties");
		
		//Data loaded into properties object through fis
		p.load(fis);
		System.out.println(p);
		System.out.println("URL IS :: "+p.getProperty("url"));
		System.out.println("USERNAME IS :: "+p.getProperty("username"));
		System.out.println("PASSWORD IS :: "+p.getProperty("password"));
		
		p.setProperty("iNeuron", "NavinReddy");//Setting new Property
		FileOutputStream fos = new FileOutputStream("database.properties");
		p.store(fos, "Map operation got concluded");
	}

}
