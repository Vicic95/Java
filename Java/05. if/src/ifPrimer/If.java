package ifPrimer;

public class If {

	public static void main(String[] args) {
		// Stanja koja se najcesce porede
        System.out.println(5 != 6);
        System.out.println(10 == 11);
        System.out.println(9 < 16);
        System.out.println(19 > 100);
        
        // Break u petlji: 
        int num = 0;
        
        while(true) {
            System.out.println("Petlja: " + num);
            
            if(num == 5) {
            	System.out.println("Break");
                break;
            }
            num++;
            System.out.println("Izvrsavanje...");
        }

	}

}
