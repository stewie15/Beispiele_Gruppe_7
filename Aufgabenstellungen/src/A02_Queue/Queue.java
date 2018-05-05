package A02_Queue;

public class Queue<T> {
	private Node<T> first;
	private Node<T> last;
	private int counter = 0;

	/**
	 * Das vorderste (=erste) Element aus der Queue entfernen und zur�ckliefern.
	 * Existiert kein Element, wird eine Exception ausgelöst.
	 * 
	 * @throws QueueEmptyException
	 */
	public T dequeue() throws QueueEmptyException {
		if (first != null) {
			counter--;
			Node<T> outNode = first;
			first = first.getNext();
			return outNode.getData();
		}
		throw new QueueEmptyException();
	}

	/**
	 * Übergebenen Integer am Ende der Queue anh�ngen.
	 * 
	 * @param i
	 *            Zahl
	 */
	public void enqueue(T i) {
		counter++;
		if (first == null) {
			first = new Node<T>(i);
			last = first;
		} else {
			last.setNext(new Node<T>(i));
			last = last.getNext();
		}
	}

	/**
	 * Liefert die Anzahl der Elemente im Stack
	 * 
	 * @return
	 */
	public int getCount() {
		return counter;
	}
}
