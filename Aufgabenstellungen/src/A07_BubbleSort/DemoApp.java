package A07_BubbleSort;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] personen = new Person[9];
		personen[0] = new Person("Homer", "Simpson");
		personen[1] = new Person("Marge", "Simpson");
		personen[2] = new Person("Lisa", "Simpson");
		personen[3] = new Person("Bart", "Simpson");
		personen[4] = new Person("Maggie", "Simpson");
		personen[5] = new Person("Albert", "Einstein");
		personen[6] = new Person("Max", "Planck");
		personen[7] = new Person("Edwin", "Hubble");
		personen[8] = new Person("Richard", "Feynman");
		
		for(int i = 0; i < personen.length; i++) {
			System.out.println(personen[i]);
		}
		
		System.out.println(personen[0].getNachname().compareTo(personen[5].getNachname()));
		
		String s = personen[0].getNachname();
		String s1 = personen[5].getNachname();
		
		System.out.println(s1.compareTo(s));
	}

}
