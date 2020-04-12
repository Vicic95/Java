package runtimeCheckedException;

public class RuntimeCheckedException {

	public static void main(String[] args) {
		int broj = 0;
		//ArithmeticException - broj = broj / 0;
		try {
			broj = broj/0;
		} catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		
		String str = null;
		//NullPointerException - System.out.println(str.length());
		try {
			System.out.println(str.length());
		} catch(RuntimeException e) { 
			System.out.println(e.toString());
		}
		
		String[] voce = {"jabuka","banana"};
		//ArrayIndexOutOfBound - System.out.println(voce[5]);
		try{
			System.out.println(voce[5]);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
