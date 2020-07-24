package innerClass;
//Moze imati samo jednu public klasu u okviru jednog fajla , ali moze vise unutrasnjih
public class Osoba {
	private String ime;

	//Inner Class
	//Sluzi da grupisemo neke funkcionalnosti klase , ako hocemo da ima pristup atributima klase
	class Ponasanje {
		public void pozdrav () {
			System.out.println("Zdravo ja sam " + ime);
		}
	}
	//sluzi kada hoces da imamo koju klasu koja nije povezana sa atributima u glavnoj klasi 
	//ali da se grupise sa glavnom klasom
	//Ako bi u nekoj unutrasnjoj klasi imali lokalnu promenljivu , morala bi da bude final
	public static class Nesto {
		public void nesto() {
			System.out.println("Nesto klasa");
		}
	}
	public Osoba(String ime) {
		this.ime = ime;
	}
	public void show() {
		System.out.println("Osoba - " + ime);
		
		Ponasanje ponasanje1 = new Ponasanje();
		ponasanje1.pozdrav();
	}
}
