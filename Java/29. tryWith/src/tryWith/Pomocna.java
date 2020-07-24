package tryWith;

public class Pomocna implements AutoCloseable {
	public void close() throws Exception {
		System.out.println("Close");
	}
}
