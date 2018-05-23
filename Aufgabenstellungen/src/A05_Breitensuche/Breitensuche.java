package A05_Breitensuche;

import java.util.ArrayList;
import java.util.List;

import A02_Queue.Queue;
import A02_Queue.QueueEmptyException;

public class Breitensuche extends BaseTree<Integer> {

	@Override
	protected int compare(Integer a, Integer b) {
		return a.compareTo(b);
	}

	/**
	 * Liefert Knoten des Baums ausgehend von Start in Reihenfolge der Breitensuche
	 * zur�ck
	 * 
	 * @param start
	 *            Startknoten f�r Teilbaum
	 * @return Liste der Knoten in Breitenfolge
	 * @throws QueueEmptyException
	 */
	public List<Integer> getBreadthFirstOrder(Node<Integer> start) {
		/* Rückgabe Liste */
		List<Integer> res = new ArrayList<>();
		res.add(start.getValue());

		/* Queue für die Abarbeitung der Knoten */
		Queue<Node<Integer>> q = new Queue<>();

		try {
			/* Einfügen der beiden Knoten nach Start */
			q.enqueue(start.left);
			q.enqueue(start.right);
			/* Durchlauf der Queue solange die Queue mindestens einen Knoten enthält */
			while (q.getCount() > 0) {
				Node<Integer> curr = q.dequeue();
				/* Prüfe, ob das nächste Element ein gültiger Knoten ist */
				if (curr == null) {
					break;
				}
				/* Füge den Wert des Knotens zur Ergebnisliste hinzu */
				res.add(curr.getValue());
				// Prüfe, ob noch nachfolgende Knoten existieren und füge sie in die Queue ein
				// */
				if (curr.left != null)
					q.enqueue(curr.left);
				if (curr.right != null)
					q.enqueue(curr.right);
			}
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * Liefert Knoten des Baums ausgehend von Start in Reihenfolge der Breitensuche
	 * zur�ck, allerdings nur jene Knoten, die in der angegebenen Ebene liegen
	 * (Start hat Ebene=1)
	 * 
	 * @param start
	 *            Startknoten f�r Teilbaum
	 * @param level
	 *            Nur Knoten dieser Ebene ausgeben
	 * @return Liste aller Knoten
	 */
	public List<Integer> getBreadthFirstOrderForLevel(Node<Integer> start, int level) {
		/* Rückgabe Liste */
		List<Integer> res = new ArrayList<>();
		/* Queue für die Abarbeitung der Knoten */
		Queue<Node<Integer>> q = new Queue<>();
		/*
		 * Abfrage, ob Startknoten die Wurzel ist. Wenn nicht muss das Level um 1 erhöht
		 * werden damit das untere Level gezählt wird. Level des Knoten wäre somit nicht
		 * 1 und um das untere Level zu erreichen muss das Level um 1 erhöht werden.
		 */
		
		/* Ist der nur ein Level gesucht so wird nur dieses Level hinzugefügt. */
		if (level == 1) {
			/*
			 * überprüfe, ob Knoten ein Wurzelknoten ist. Wenn ja setze @param Parent mit
			 * übergeordneten Knoten
			 */
			if (start.getParent() != null) {
				Node<Integer> parent = start.getParent();
				/*
				 * Nutze hilfsmethode und suche alle Knoten mit dem gleichen Level
				 */
				if (parent.left == start) {
					res.add(parent.right.getValue());
				} else {
					res.add(parent.left.getValue());
				}
			}
			/*
			 * ist der übergebene Knoten ein Wurzelknoten, dann füge nur diesen in die Liste
			 * ein
			 */
			res.add(start.getValue());
		}
		
		if (start.getParent() != null)
			level++;

		try {
			/* Einfügen der beiden Knoten nach Start */
			q.enqueue(start.left);
			q.enqueue(start.right);

			/* Durchlauf der Queue solange die Queue mindestens einen Knoten enthält */
			while (q.getCount() > 0) {
				Node<Integer> curr = q.dequeue();
				/* Prüfe, ob das nächste Element ein gültiger Knoten ist */
				if (curr == null) {
					break;
				}
				/*
				 * Füge den Wert des Knotens zur Ergebnisliste hinzu, wenn das Level dem
				 * übergebenen gleicht
				 */
				if (curr.getLevel() == level)
					res.add(curr.getValue());

				/*
				 * Prüfe, ob noch nachfolgende Knoten existieren und füge sie in die Queue ein
				 */
				if (curr.left != null)
					q.enqueue(curr.left);
				if (curr.right != null)
					q.enqueue(curr.right);
			}
			
		} catch (QueueEmptyException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	/*
	 * Zusätzlich suche ich alle Knoten mit dem gleichen Level
	 * (Alle Knoten einer Ebene (level))
	 * 
	 * Wenn diese Methode aufgerufen wird funktioniert der Test jedoch leider nicht.
	 * Deswegen wurde die Methode auskommentiert und könnte jederzeit wieder neu
	 * implementiert werden.
	 * 
	 * 
	 * 	public static List<Node<Integer>> getAll(Node<Integer> n) {
			List<Node<Integer>> res = new ArrayList<>();
			Queue<Node<Integer>> q = new Queue<>();
			Node<Integer> root = n;
			
			while(n.getParent() != null) {
				n = n.getParent();
				if(n.getParent() == null)
					root = n;
			}
			
			System.out.println(root.getValue());
			res.add(n);
			try {
				q.enqueue(n.left);
				q.enqueue(n.right);
				while (q.getCount() > 0) {
					Node<Integer> curr = q.dequeue();
					if (curr == null) {
						break;
					}
					if(!res.contains(curr))
						res.add(curr);

					if (curr.left != null)
						q.enqueue(curr.left);
					if (curr.right != null)
						q.enqueue(curr.right);
				}
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
			
			return res;
		}
		
		for(Node<Integer> n : getAll(start)) {
							if(n.getLevel() == start.getLevel())
								res.add(n.getValue());
						}
	 */
}