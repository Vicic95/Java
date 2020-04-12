package access;

public class Osoba {
	private String ime;
    protected String prezime;
    int godine;
    //los nacin programiranja sa public promenljivom 
    public String los;
    //public se koristi samo kod inicijalizacije konstante
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
