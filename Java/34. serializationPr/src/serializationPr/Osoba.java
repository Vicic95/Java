package serializationPr;

import java.io.Serializable;

public class Osoba implements Serializable{
	
	/**
	 * 
	 */
	//Ovaj ID sluzi da oznacimo verziju fajla koji smo izmenili,tj kada izmenimo klasu izmenimo ID
	//Ako pokusamo da citamo fajl iz druge main klase, koja poseduje staru verziju ove klase
	//Ona ce imati stariju vrednsot ID-a, i izbacice exception da nije isti ID
	private static final long serialVersionUID = -4551134551362949141L;
	private String ime;
	private String prezime;
	private int godine;
	
	public Osoba(String ime, String prezime, int godine) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", godine=" + godine + "]";
	}
	
	
}
