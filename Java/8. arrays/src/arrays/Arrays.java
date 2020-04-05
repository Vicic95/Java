package arrays;

public class Arrays {

	public static void main(String[] args) {
        int[] niz;
        niz = new int[3];
        
        //na pocetku svi su 0
        System.out.println(niz[0]);
        int broj = 10;
        int i;
        
        //duzina niza se dobija sa niz.length
        for(i=0;i<niz.length;i++) {
        	niz[i]=broj;
        	broj+=10;
        }
        for(i=0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
        
        int[] niz2 = {1, 5, 7};
        
        for(i=0; i < niz2.length; i++) {
            System.out.println(niz2[i]);
        }

	}

}
