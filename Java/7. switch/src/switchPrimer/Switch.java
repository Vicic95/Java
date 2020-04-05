package switchPrimer;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Unesite naredbu: ");
        String str = sc.nextLine();

        switch (str) {
	        case "start":
	            System.out.println("Started!");
	            break;
	        case "stop":
	            System.out.println("Stopped.");
	            break;
	        default:
	            System.out.println("Nepoznata naredba");
        }
        sc.close();
	}
}
