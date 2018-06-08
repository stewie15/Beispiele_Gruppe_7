package A07_BubbleSort;

public class BubbleSort implements PersonenSort {

	/**
	 * Sortier-Funktion
	 */
	public void sort(Person[] personen) {
		
		if(personen.length == 0) return;
		
		for(int i = 1; i < personen.length; i++) {
			System.out.println("run: " + i);
			for (int j = 0; j < personen.length-1; j++) {
				System.out.println(personen[j+1].compareTo(personen[j]));
				
				System.out.println("1"+personen[j].getNachname() + " " + personen[j].getVorname());
				System.out.println("2"+personen[j+1].getNachname() + " " + personen[j+1].getVorname());
				if(personen[j+1].compareTo(personen[j]) == -1) {
					Person p = personen[j+1];
					personen[j+1] = personen[j];
					personen[j] = p;
					System.out.println("\n Result");
					
					System.out.println("1"+personen[j].getNachname() + " " + personen[j].getVorname());
					System.out.println("2"+personen[j+1].getNachname() + " " + personen[j+1].getVorname());
				}
			}
		}
		
		
		/*
		boolean change = true;
		
		while(change == true) {
			if(personen.length < 1) break;
			for(int i = 1; i < personen.length; i++) {
				if(personen[i-1].compareTo(personen[i]) == -1) {
					Person p = personen[i-1];
					personen[i-1] = personen[i];
					personen[i] = p;
				} else if(personen[i-1].compareTo(personen[i]) == 0) {
					change = false;
				}
			}
		}*/
	}
	
}
