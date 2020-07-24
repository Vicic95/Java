package abstractClass;

//apstrakcija Osobe , ideja koju bi sve Osobe - potklase morale da ispunjavaju
//ali tako da svaka implementira na svoj nacin
//Deklarise se sa abstract i ne moze da kreira svoje objekte
//Za razliku od interfejsa koje mozes da implementira koliko hoces, apstraktnu klasu mozes samo jednu
public abstract class Osoba {
	private String ime;

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	//Ne sme biti privaate, jer u tom slucaju nece biti nasledjen
	//Metode koje moraju da implementiraju sve potklase
	//Ako klasa ima jednu apstraknu metodu i sama postaje apstraktna
	public abstract void show();
	
	//Za razliku od interfejsa , moze da se napravi metoda koja je implementirana
	public void metoda() {
		System.out.println("Zajednicka Metoda");
		show();
	}
	
}
