package enumPr;

public class EnumPr {

	// Kada imamo enum , ovo nam ne treba
	// public static final int BLUE = 0;
	// public static final int RED = 1;
	// public static final int GREEN = 2;

	public static void main(String[] args) {

		Boje boje = Boje.BLUE;
		switch (boje) {
		case RED:
			System.out.println("crvena");
			break;
		case GREEN:
			System.out.println("zelena");
			break;
		case BLUE:
			System.out.println("plava");
			break;
		default:
			break;
		}
		System.out.println(Boje.BLUE.getClass());
		System.out.println(Boje.BLUE instanceof Boje);
		
		System.out.println(Boje.BLUE instanceof Enum);
		//Pretvara u String
		System.out.println(Boje.GREEN.name());
		
		//Moze da se uradi override toString
		Boje boje2 = Boje.valueOf("RED");
		System.out.println(boje2);
	}

}
