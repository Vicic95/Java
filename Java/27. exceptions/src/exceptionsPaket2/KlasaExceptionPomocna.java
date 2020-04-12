package exceptionsPaket2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class KlasaExceptionPomocna {
	public void metod() throws IOException,ParseException {
		throw new ParseException("Greska ",2);
	}
	public void ulaz() throws IOException,FileNotFoundException{
		
	}
}
