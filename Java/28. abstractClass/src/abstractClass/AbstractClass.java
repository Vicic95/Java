package abstractClass;

public class AbstractClass {

	public static void main(String[] args) {
		//Potklase nasledjuje sva svojstva svih superklasa
		//Klase na visim hijerarhijskim nivoima su uopstenije
		//Ponekad natklasa postane toliko uopstena, da ne moze imati direktnu primenu u vidu objekta
		//Takva klasa se naziva apstraktna klasa
		OsobaNasl osobaN = new OsobaNasl();
		osobaN.setIme("Pera");
		osobaN.show();
		
		//Ne moze se kreirati objekat apstraktne klase
		//Osoba osoba = new Osoba();
		DrugaOsoba dOsoba = new DrugaOsoba();
		dOsoba.setIme("Zika");
		dOsoba.show();
		
		dOsoba.metoda();
	}

}
