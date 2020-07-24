package serializationPr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWrite {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba("Pera","Peric",52);
		Osoba osoba2 = new Osoba("Zika","Zikic",25);
		
		System.out.println(osoba1);
		System.out.println(osoba2);
		
		//Automatski vrsi close
		try(FileOutputStream fs = new FileOutputStream("test.bin")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(osoba1);
			os.writeObject(osoba2);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}

}
