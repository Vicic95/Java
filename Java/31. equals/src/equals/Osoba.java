package equals;

public class Osoba {
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
	
	//Ako prevazidjemo equals onda dva objekta koja imaju iste atribute koji su zahtevani za equals, smatraju se jednakim
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (godine != other.godine)
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
	
	
}
