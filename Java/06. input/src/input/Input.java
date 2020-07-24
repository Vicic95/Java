package input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// Kreiranje Scanner objekta , koji sluzi za unosenje podataka
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Unesite broj: ");        
        // Unosenje podatak sa standardnog ulaza
        double v = sc.nextDouble();
      
        System.out.println("Uneli ste: " + v);
        sc.close();
        
	}

}
