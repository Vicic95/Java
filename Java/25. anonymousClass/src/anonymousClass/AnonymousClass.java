package anonymousClass;

public class AnonymousClass {

	public static void main(String[] args) {
		
		//Anonimna potklasa klase Osoba 
		Osoba osoba1 = new Osoba() {
			@Override
			public void show() {
				System.out.println("Override Osoba");
			}
		};
		osoba1.show();
		
		
		OsobaInterface osobaInt = new OsobaInterface() {
			@Override
			public void show() {
				System.out.println("Osoba interace");
			}
		};
		osobaInt.show();
	}

}
