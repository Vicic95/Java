package toString;

class Osoba {
    
    String ime;
    String prezime;
    int godine;
	public Osoba(String ime, String prezime, int godine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" - ").append(prezime).append(": ").append(godine);
		return sb.toString();
	}

    
}
public class ToString {

	public static void main(String[] args) {
		//toString i StringBuilder
		// Nije efikasno
        String str = "";
        
        str += "Ja sam Zika.";
        str += " ";
        str += "Zika Ziks.";
        
        System.out.println(str);
        
        // efikasnije
        StringBuilder sb = new StringBuilder("");
        
        sb.append("Ja sam Mika.");
        sb.append(" ");
        sb.append("Mika Miks.");
        
        System.out.println(sb.toString());
        
        //Isto ,samo lepse
        
        StringBuilder s = new StringBuilder();
        
        s.append("Ja sam Jova.")
        .append(" ")
        .append("Jova Jovin.");
        
        System.out.println(s.toString());

        
        // Ispis /t tab /nNewline
        System.out.print("Text.tTab.nNewline.");
        System.out.println(" jos teksta.");
        
        // %-10d 10 space-a i left-aligning (%10d right-align)
        System.out.printf("Zika ima %-10d; Fali mu %d", 120, 10);
        System.out.println();
        // String sa %s
        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: %s", i, "Tekst ");
        }
      
        // 2 decimale :
        System.out.printf("Total value: %.2fn", 5.6874);
        
        // 1 decimala , left-aligned u 6 na 6 mesta:
        System.out.printf("Ukupno: %-6.1fn", 343.23423);
        
        String formatted = String.format("Float: %.3f", 5.12345);
        System.out.println(formatted);
        
        // %% za % 
        System.out.printf("Ukupno ima %d%% .", 90);
        System.out.println();
        Osoba osoba1 = new Osoba("Zika","Ziks",46);
        Osoba osoba2 = new Osoba("Mika","Miks",21);
        Osoba osoba3 = new Osoba("Jova","Jovin",67);
        System.out.println(osoba1);
        System.out.println(osoba2);
        System.out.println(osoba3.toString());
	}

}
