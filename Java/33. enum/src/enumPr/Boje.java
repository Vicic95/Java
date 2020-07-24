package enumPr;

public enum Boje {
	RED(0),BLUE(1),GREEN(2);
	
	
	//Moze ima atribute,getter i setter
	private int vr;
	//Konstruktor ne moze biti public
	//Moze imati parametre , ali moraju se dodeliti te vrenosti svakom 
	Boje(int vr){
		this.vr=vr;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vr);
		return sb.toString();
	}
}
