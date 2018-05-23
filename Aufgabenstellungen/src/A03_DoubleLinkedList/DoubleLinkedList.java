package A03_DoubleLinkedList;

public class DoubleLinkedList<T> {
	
	private Node<T> first;
	private Node<T> last;
	private Node<T> newNode;
	private int counter;
	/**
	 * Einf�gen einer neuen <T>
	 * 
	 * @param a
	 *            <T>
	 */
	public void add(T a) {
		counter++;
		if(first == null) {
			first = new Node<>(a);
			last = first;
			first.setPrevious(null);
		}
		newNode = new Node<>(a);
		last.setNext(newNode);
		newNode.setPrevious(last);
		last = newNode;
	}

	/**
	 * Internen Zeiger f�r next() zur�cksetzen
	 */
	public void reset() {
		first.setNext(null);
		last.setNext(null);
	}

	/**
	 * analog zur Funktion reset()
	 */
	public void resetToLast() {
		
	}

	/**
	 * Liefert erste Node der Liste retour oder null, wenn Liste leer
	 * 
	 * @return Node|null
	 */
	public Node<T> getFirst() {
		if(first!=null) return first;
		return null;
	}

	/**
	 * Liefert letzte Node der Liste retour oder null, wenn Liste leer
	 * 
	 * @return Node|null
	 */
	public Node<T> getLast() {
		if(last!=null) return last;
		return null;
	}

	/**
	 * Gibt aktuelle <T> zur�ck und setzt internen Zeiger weiter. Falls current
	 * nicht gesetzt, wird null retourniert.
	 * 
	 * @return <T>|null
	 */
	public T next() {
		
		return null;
	}

	/**
	 * analog zur Funktion next()
	 * 
	 * @return <T>|null
	 */
	public T previous() {

		return null;
	}

	/**
	 * Current-Pointer auf n�chste <T> setzen (aber nicht auslesen). Ignoriert
	 * still, dass current nicht gesetzt ist.
	 */
	public void moveNext() {

	}

	/**
	 * Analog zur Funktion moveNext()
	 */
	public void movePrevious() {

	}

	/**
	 * Retourniert aktuelle (current) <T>, ohne Zeiger zu �ndern
	 * 
	 * @return <T>
	 * @throws CurrentNotSetException
	 */
	public T getCurrent() throws CurrentNotSetException {

		return null;
	}

	/**
	 * Gibt <T> an bestimmter Position zur�ck
	 * 
	 * @param pos
	 *            Position, Nummerierung startet mit 1
	 * @return <T>|null
	 */
	public T get(int pos) {

		return null;
	}

	/**
	 * Entfernen des Elements an der angegebenen Position. Falls das entfernte
	 * Element das aktuelle Element ist, wird current auf null gesetzt.
	 * 
	 * @param pos
	 */
	public void remove(int pos) {

	}

	/**
	 * Entfernt das aktuelle Element. Als neues aktuelles Element wird der
	 * Nachfolger gesetzt oder (falls kein Nachfolger) das vorhergehende Element
	 * 
	 * @throws CurrentNotSetException
	 */
	public void removeCurrent() throws CurrentNotSetException {

	}

	/**
	 * Die Methode f�gt die �bergebene <T> nach der aktuellen (current) ein und
	 * setzt dann die neu eingef�gte <T> als aktuelle (current) <T>.
	 * 
	 * @throws CurrentNotSetException
	 */
	public void insertAfterCurrentAndMove(T a) throws CurrentNotSetException {

	}
}
