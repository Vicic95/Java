package multiDimensionalArrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
        int[] niz = {24, 8, 1995};
        
        System.out.println(niz[2]);
        
        //Testraesta matrica
        int[][] tM = {
            {24,8 , 1995},
            {9, 5},
            {1, 2, 3, 4}
        };
        
        //Pristup elementu matrice
        System.out.println(tM[1][1]);
        System.out.println(tM[0][2]);
        
        String[][] strs = new String[2][3];
        
        strs[0][1] = "Zdravo";
        
        System.out.println(strs[0][1]);
        
        //iteracija kroz 2D
        for(int row=0; row < tM.length; row++) {
            for(int col=0; col < tM[row].length; col++) {
                System.out.print(tM[row][col] + "\t");
            }
            System.out.println();
        }
        
        // Poslednja dimenzija je opcionalna
        String[][] words = new String[2][];
        
        //Default na null
        System.out.println(words[0]);
        
        //Mozemo pojedinacno podniz da alociramo
        words[0] = new String[3];
        
        words[0][1] = "Pozdrav";
        
        System.out.println(words[0][1]);

	}

}
