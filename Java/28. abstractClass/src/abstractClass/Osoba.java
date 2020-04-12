package abstractClass;

//apstrakcija Osobe , ideja koju bi sve Osobe - potklase morale da ispunjavaju
//ali tako da svaka implementira na svoj nacin, a ona sama je apstrakcija
//Za razliku razliku od interfejsa koje mozes da implementira koliko hces
// Samo jednu apstraktnu klasu mozes da nasledis
public abstract class Osoba {
	private String ime;

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	//Metode koje moraju da implementiraju sve potklase
	public abstract void show();
	
	//Za razliku od interfejsa , moze da se napravi metoda koja je implementirana
	//Metoda koja se isto izvrsava za sve potklase
	//Moze da se uradi override
	public void metoda() {
		System.out.println("Zajednicka Metoda");
		show();
	}
	
}
