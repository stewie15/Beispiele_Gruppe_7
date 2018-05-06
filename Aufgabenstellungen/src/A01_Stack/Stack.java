package A01_Stack;


public class Stack<T>
{
	 private Node<T> first;
	 private int counter;
    /**
     * Oberstes Element entfernen und zur�ckliefern.
     * Existiert kein Element, wird eine Exception ausgel�st.
     * @throws StackEmptyException 
     */
    public T pop() throws StackEmptyException {
    	/* 
    	 * Prüfe, ob Stack befüllt ist, wenn nicht wirf eine Exception 
    	 */
    	if(counter == 0) {
        	throw new StackEmptyException();
    	}
    	/* 
    	 * Veringere den Zähler um 1
    	 * Setze first auf outNode
    	 * first.getNext() wird als neues erstes gesetzt
    	 * Daten von outNode werden zurück geliefert 
    	 */
    	counter--;
		Node<T> outNode = first;
		first = outNode.getNext();    		
		return outNode.getData();
    }
    
    /**
     * �bergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {
    	/* 
    	 * neue Zwischenvariable newNode
    	 */
    	Node<T> newNode = new Node<T>(i);
    	/* 
    	 * Zähler um 1 erhöhen
    	 */
    	counter++;
    	/* 
    	 * prüfe, ob schon ein Element vorhanden ist,
    	 * wenn nicht dann ist das erste Element die newNode
    	 */
    	if(first == null) {
    		first = newNode;
    	}
    	/* 
    	 * der nachfolger von newNode ist dann das erste Element
    	 */
    	newNode.setNext(first);
    	/* 
    	 * Erstes Element ist das neue erste Element (oberstes Element)
    	 */
    	first = newNode;
    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
    	return counter;
    }
}
