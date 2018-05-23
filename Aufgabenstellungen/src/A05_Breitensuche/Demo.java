package A05_Breitensuche;

public class Demo {

	public static void main(String[] args) {

		Breitensuche bs = new Breitensuche();
		bs.add(6);
		bs.add(3);
		bs.add(10);
		bs.add(5);
		bs.add(2);
		bs.add(1);
		bs.add(12);
		bs.add(11);
		bs.add(15);

		/* Funktion 1 */
		System.out.println("Result of test 1 first function: " + bs.getBreadthFirstOrder(bs.find(15)));
		System.out.println("Result of test 2 first function: " + bs.getBreadthFirstOrder(bs.find(12)));
		System.out.println("Result of test 3 first function: " + bs.getBreadthFirstOrder(bs.getRoot()));

		/* Funktion 2 */
		System.out.println("Result of test 1 second function: " + bs.getBreadthFirstOrderForLevel(bs.getRoot(), 1));
		System.out.println("Result of test 2 second function: " + bs.getBreadthFirstOrderForLevel(bs.getRoot(), 2));
		System.out.println("Result of test 3 second function: " + bs.getBreadthFirstOrderForLevel(bs.getRoot(), 3));
		System.out.println("Result of test 4 second function: " + bs.getBreadthFirstOrderForLevel(bs.find(3), 2));
		System.out.println("Result of test 5 second function: " + bs.getBreadthFirstOrderForLevel(bs.find(11), 5));
		System.out.println("Result own test: " + bs.getBreadthFirstOrderForLevel(bs.find(3), 1));
		
	}

}
