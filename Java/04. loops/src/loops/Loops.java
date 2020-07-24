package loops;

public class Loops {

	public static void main(String[] args) {
		int num = 0;
		
        while(num < 10){
            System.out.println("While petlja: " + num);
            num += 1;
        }
        for(int i=0; i < num; i++) {
            System.out.printf("brojac u for petlji: %d\n", i);

        }
        do {
        	System.out.println("Do-while petlja: " + num);
            num = num - 1;
        }while(num>0);
	}

}
