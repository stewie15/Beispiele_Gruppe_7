package A07_BubbleSort;

public class Person {
	
	private final String nachname;
	
	private final String vorname;

	public Person(String vorname, String nachname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	/**
	 * Vergleicht zwei Personen miteinander
	 * @return <0, wenn a<b || =0, wenn a=b || >0, wenn a>b
	 */
	public int compareTo(Person p) {
		if(this.nachname.compareTo(p.nachname) < 0) return -1;
		if(this.nachname.compareTo(p.nachname) == 0) {
			if(this.vorname.compareTo(p.vorname) < 0 ) return -1;
			if(this.vorname.compareTo(p.vorname) > 0 ) return 1;
			if(this.vorname.compareTo(p.vorname) == 0 ) return 0;
		}
		return 1; 
	}

	@Override
	public String toString() {
		return "Person [nachname=" + nachname + ", vorname=" + vorname + "]";
	}

}
