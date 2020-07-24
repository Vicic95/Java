package tryWith;

public class TryWith {

	public static void main(String[] args) {
		
		//Close se automatski poziva kada se za klasu implementira interfejs Autocloseable
		//try-with uvek automatski poziva close ako klasa ima implementiran AutoCloseable
		try(Pomocna pomocna = new Pomocna()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
