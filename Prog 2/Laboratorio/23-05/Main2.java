/*
 * Implementare un metodo 'inversioni' che aggiunge in fondo a una
 * lista di numeri il numero di inversioni nella lista, ovvero il
 * numero di elementi immediatamente seguiti da un elemento piu`
 * piccolo.
 *
 * Ecco alcuni esempi di liste prima e dopo l'esecuzione del metodo:
 *
 * prima :
 * dopo  : 0
 *
 * prima : 7
 * dopo  : 7, 0
 *
 * prima : 3, 7, 1
 * dopo  : 3, 7, 1, 1
 *
 * prima : 7, 3, 2, 9, 1
 * dopo  : 7, 3, 2, 9, 1, 3
 *
 * NON E` CONSENTITO:
 * - usare break o continue all'interno di cicli
 * - usare strutture dati ausiliarie (ad esempio array)
 * - modificare il codice al di fuori dal metodo da implementare
 *
 */

class Node {
    private int elem;
    private Node next;

    public Node(int elem, Node next)
    {
	this.elem = elem;
	this.next = next;
    }

    public int getElem()
    { return elem; }

    public void setElem(int elem)
    { this.elem = elem; }

    public Node getNext()
    { return next; }

    public void setNext(Node next)
    { this.next = next; }
}

class List {
    private Node first;

    public List()
    { first = null; }

    public void insertFirst(int elem)
    { first = new Node(elem, first); }

    public String toString()
    {
	String s = "";
	for (Node p = first; p != null; p = p.getNext()) {
	    if (p != first) s += ", ";
	    s += p.getElem();
	}
	return s;
    }

    public void inversioni(){
		if(first != null){
			Node temp = first;
			Node prec = first;
			int ris = 0;
			while(temp != null){
				if(temp.getElem() < prec.getElem()){
					ris++;
				}
				prec = temp;
				temp = temp.getNext();
			}
			prec.setNext(new Node(ris, null));
		}
    }
}

public class Main2 {
    public static void main(String[] args)
    {
	test(crea(), "0");
	test(crea(7), "7, 0");
	test(crea(3, 7, 1), "3, 7, 1, 1");
	test(crea(7, 3, 2, 9, 1), "7, 3, 2, 9, 1, 3");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.inversioni();
	System.out.println("ottenuto : " + l);
	System.out.println("atteso   : " + atteso);
	System.out.println(l.toString().equals(atteso) ? "=== OK" : "=== ERRORE");
	System.out.println();
    }

    public static List crea(Integer...v)
    {
	List l = new List();
	for (int i = v.length - 1; i >= 0; i--)
	    l.insertFirst(v[i]);
	return l;
    }
}
