package variables;

public class Variables {

	public static void main(String[] args) {
		//Imamo 8 primitivnih tipova
		//Oni nisu objekti , vec jednostavne vrednosti koje imaju tacno odredjenu velicinu memorije
		
		//celobrojni velicine 32 bita 
		int num = 10;
		
		//kratak celobrojni velicine 16 bita
		short sNum = 80;
		
		//dugacak celobrojni velicine 64 bita
		long lNum = 100;

		//bajt najmanji celobrojni velicine 8 bita
		byte b = 1;

		//broj u pokretnom zarezu dvostruke tacnosti velicine 64 bita
		double d = 10.1006;
		
		//broj u pokretnom zarezu velicine 32 bita
		float f = 10.0006f;
		
		//znakovni velicine 16 bita - za razliku od C i C++ gde zauzima 8 bita
		char kar = 'l';
		
		//logicki tip
		boolean bul = true;
		
		
		System.out.println(num);
		System.out.println(sNum);
		System.out.println(lNum);
		System.out.println(d);
		System.out.println(f);
		System.out.println(kar);
		System.out.println(bul);
		System.out.println(b);
		
	}

}
