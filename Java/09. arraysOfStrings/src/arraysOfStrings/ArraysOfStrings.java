package arraysOfStrings;

public class ArraysOfStrings {

	public static void main(String[] args) {
		String[] str = new String[3];
        
        //Inicijalizovanje(postavljanje referenci na stringove)
        str[0] = "Zdravo";
        str[1] = " ";
        str[2] = ".";
        
        //Pristup elementu niza
        System.out.println(str[2]);
        
        String[] voce = {"jabuka", "banana", "kruska", "visnja", "kajsija", "kupina"};
        
        // Iteracija kroz niz
        for(String vocka: voce) {
            System.out.println(vocka);
        }
        
        //default za broj
        int num = 0;
        System.out.println(num);
        // Default za reference je "null"
        String string = null;
        
        System.out.println(string);
        
        String[] strs = new String[2];
        
        // Default za reference na niz stringova su null
        System.out.println(strs[0]);
        
	}

}
