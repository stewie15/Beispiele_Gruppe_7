package A06_Tiefensuche;

public class Film {

	private final String titel;
	
	private final double lenght;

	public Film(String titel, double lenght) {
		this.titel = titel;
		this.lenght = lenght;
	}

	public String getTitel() {
		return titel;
	}

	public double getLenght() {
		return lenght;
	}

	@Override
	public String toString() {
		return titel + " (L�nge: " + lenght + ")";
	}

}
