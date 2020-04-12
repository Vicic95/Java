package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args){
		
		File fajl = new File("test.txt");
	
		//Exception nam izbaca problem koji je nastao i liniju u kodu gde se dogodila greska
		//Moze throws ili try-catch
		try {
			FileReader fr = new FileReader(fajl);
			
			//Ovo nece da se izvrsi ako je pre toga izbacen ecxeption
			System.out.println("Izvrsavanje");
			System.out.println("Bilo sta "+ fr.toString());
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nije pronadjen fajl " + fajl.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Gotovo");
	
	}

}
