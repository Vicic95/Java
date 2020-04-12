package exceptionsPaket2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Exception2 {
	public static void main(String[] args) {
		try {
			otvoriFajl();
		} catch (FileNotFoundException e) {
			System.out.println("Ne moze se otvoriti fajl");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		KlasaExceptionPomocna tmp = new KlasaExceptionPomocna();
		
		//mogao je multi-catch , gde bi isto radio za sve exception-e
		try {
			tmp.metod();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Greska parse");
		}
		
		//Mora ovaj raspored , jer bio inace i gresku FileNotFound , bila uzeta u IOException
		//Cak i u slucaju multi-catch-a ,isto bio morali prvo exception koju se su child 
		try {
			tmp.ulaz();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");
		} catch (IOException e) {
			System.out.println("IOException ");
		}
		
		
	}
	public static void otvoriFajl() throws IOException {
		File fajl = new File("test.txt");
		
		FileReader fr = new FileReader(fajl);
		
		fr.close();
	}
}
