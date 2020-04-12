package abstractClass;

public class AbstractClass {

	public static void main(String[] args) {
		OsobaNasl osobaN = new OsobaNasl();
		osobaN.setIme("Pera");
		osobaN.show();
		
		DrugaOsoba dOsoba = new DrugaOsoba();
		dOsoba.setIme("Zika");
		dOsoba.show();
		
		dOsoba.metoda();
	}

}
