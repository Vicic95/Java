package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderKlasa {

	public static void main(String[] args) {
		
		//stariji nacin citanja iz fajla - FileReader
		File fajl = new File("test.txt");
		try {
			FileReader fr = new FileReader(fajl);
			//Da bi citali liniju po liniju
			BufferedReader br = new BufferedReader(fr);
			
			String linija;
			int brojac = 1;
			while((linija = br.readLine()) != null) {
				System.out.println(brojac + " - " + linija);
				brojac++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		} 
	}

}
