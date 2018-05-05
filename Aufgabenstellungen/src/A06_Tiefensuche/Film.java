package A06_Tiefensuche;

public class Film {

	private final String titel;
	
	private final double l�nge;

	public Film(String titel, double l�nge) {
		this.titel = titel;
		this.l�nge = l�nge;
	}

	public String getTitel() {
		return titel;
	}

	public double getL�nge() {
		return l�nge;
	}

	@Override
	public String toString() {
		return titel + " (L�nge: " + l�nge + ")";
	}

}
