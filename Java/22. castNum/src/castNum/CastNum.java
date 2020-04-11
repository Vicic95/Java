package castNum;

public class CastNum {

	public static void main(String[] args) {
		int broj = 567;
		short brojS = 23;
		byte b = 20;
		long brojL = 232323;
		
		float brojF = 23.2323f;
		double brojD = 23.232323;

		System.out.println(Byte.MAX_VALUE);
		
		//Ako je brojL veci od maksimalno moguceg int broja ,dolazi do greske
		broj = (int)brojL;
		
		System.out.println(broj);
		
		//Automatski cast , jer je manja mogucnsot da dodje do greske
		brojD = broj;
		System.out.println(brojD);
		
		//DOlazi do odsecanja brojeva
		broj = (int)brojF;
		System.out.println(broj);
		
		//127 je maksimum, tako da je 128 prevelik i ovde dobijamo minimalni byte
		b = (byte)128;
		System.out.println(b);
	
		//Takodje integer moze imati vecu vrednsot od maksimuma short.
		brojS = (short)broj;
		System.out.println(brojS);
	}

}
