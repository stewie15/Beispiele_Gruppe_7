package A01_Stack;

public class Demo {

	public static void main(String[] args) {
		int counter = 0;
		Stack<Integer> s = new Stack<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);

		while (counter < 4) {
			try {
				System.out.println(s.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
		}
	}

}
