package serializationPr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationRead {

	public static void main(String[] args) {
		System.out.println("Citanje");
		
		try(FileInputStream fi = new FileInputStream("test.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
		
			Osoba osoba1 = (Osoba) os.readObject();
			Osoba osoba2 = (Osoba) os.readObject();
			
			System.out.println(osoba1);
			System.out.println(osoba2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
