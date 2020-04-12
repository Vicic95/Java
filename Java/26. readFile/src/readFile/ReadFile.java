package readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{

	public static void main(String[] args) throws FileNotFoundException{
		//tekst fajl se cuva u folderu gde se nalazi projekat ili se postavlja putanja do fajla
		String fajl = "test.txt";
		
		File tekstfajl = new File(fajl);
		
		//moze da se postavi  try-catch ili throws FileNotFoundEcxeption
		
		Scanner sc = new Scanner(tekstfajl);
		
		int broj = sc.nextInt();
		System.out.println(broj);
		
		//Nakon broja i dalje je tu znak za novi red, njega preskocemo jer bi se inace brojao kdo brojaca linija
		sc.nextLine();
		int brojac = 2;
		
		while(sc.hasNextLine()) {
			String linija = sc.nextLine();
			
			System.out.println(brojac + " - "+ linija);
			brojac++;
		}
		sc.close();
	}

}
