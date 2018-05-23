package A05_Breitensuche;

public class Node<Type> {

	/**
	 * Linkes Kind
	 */
	protected Node<Type> left;

	/**
	 * Rechtes Kind
	 */
	protected Node<Type> right;

	/**
	 * Elternelement
	 */
	protected Node<Type> parent;

	/**
	 * Wert des Knotens, hier: String, der Wort enth�lt
	 */
	protected final Type value;

	/*
	 * HINZUGEFÜGTES ATTRIBUT FÜR LEVEL!!
	 */
	private int level;

	/**
	 * Konstruktor
	 * 
	 * @param value
	 *            Zu speichernder Wert
	 */
	public Node(Type value) {
		this.value = value;
		/*
		 * set level automatically on 1
		 */
		this.level = 1;
	}

	public Node<Type> getLeft() {
		return left;
	}

	public void setLeft(Node<Type> left) {
		this.left = left;
	}

	public Node<Type> getRight() {
		return right;
	}

	public void setRight(Node<Type> right) {
		this.right = right;
	}

	public Node<Type> getParent() {
		return parent;
	}

	public void setParent(Node<Type> parent) {
		this.parent = parent;
	}

	public Type getValue() {
		return value;
	}
	
	/*
	 * Getter and Setter vor @param level
	 */

	public int getLevel() {
		return level;
	}

	public void setLevel(int i) {
		this.level = this.level + i;
	}
}
