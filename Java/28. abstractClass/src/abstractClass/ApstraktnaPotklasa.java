package abstractClass;

public abstract class ApstraktnaPotklasa extends Osoba{

	//Ako se ne predefinisu sve apstraktne nasledjene metode
	//Potklasa postaje apstraktna i nije moguce kreiranje objekta
	@Override
	public abstract void show();
}
