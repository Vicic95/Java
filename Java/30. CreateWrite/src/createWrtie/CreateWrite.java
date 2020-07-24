package createWrtie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWrite {
	public static void main(String[] args) {
		File fajl = new File("test.txt");
		//Kreira fajl u projektu , da bi se video , moramo refresovati projekat
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fajl))){
			br.write("prva linija");
			br.newLine();
			br.write("Druga");	
		}catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
