package tryWith;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File fajl = new File("test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(fajl))){
			String linija;
			while((linija = br.readLine()) != null) {
				System.out.println(linija);
			}
		}catch(FileNotFoundException e) {
			System.out.println("fajl nije pronadjen " + fajl.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	
	}

}
