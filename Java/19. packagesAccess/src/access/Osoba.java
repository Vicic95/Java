package access;

public class Osoba {
	private String ime;
    protected String prezime;
    int godine;
    //lose
    public String los;
    //ovo moze final
    public final static int ID = 8;
    
	public Osoba() {
		this.los = "los";
		this.ime ="Mika";
		this.prezime = "Miks";
		this.godine = 25;
	}

	public String getIme() {
		return ime;
	}
}
