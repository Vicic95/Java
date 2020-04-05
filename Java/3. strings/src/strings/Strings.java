package strings;

public class Strings {

	public static void main(String[] args) {
		//String je klasa-objekat tipa String nepromenljiv
		//Svaka promena kreira novi String u memoriji
        int Num = 72;
        
        String s = "Zdravo";        
        String b = " ";
        String n = "Bobane";
        String greeting = s + b + n;
        
        System.out.println(greeting);
        
        System.out.println("Zdravo" + " " + "Bobane");
        
        System.out.println("Moj broj: " + Num);
        
        double d = 876.82;
        
        System.out.println("Moj broj: " + d);

	}

}
