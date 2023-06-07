public class TestNodeUtil{
	public static void main(String args[]){
		System.out.println("------Prova con liste di interi----");
		
		Node<Integer> r = null;
		Node<Integer> t = new Node<Integer>(1,new Node<Integer>(2,new Node<Integer>(3,new Node<Integer>(4, new Node<Integer>(5, new Node<Integer>(1, null))))));
		Node<Integer> s = new Node<Integer>(1,new Node<Integer>(2,new Node<Integer>(3,null)));
		System.out.println("Lunghezza: " + NodeUtil.size(t));
		System.out.println("Occorrenze di " + 1 + ": " + NodeUtil.occurences(t, 1));
		System.out.println("Incluso: " + NodeUtil.included(s,t));
		System.out.print("Inversa: "); 
		NodeUtil.printList(NodeUtil.reverse(s)); // Stampa [3 2 1]	
		NodeUtil.printList(s); // Stampa [1 2 3]
		Node<Node<Integer>> list = new Node<Node<Integer>>(r, new Node<Node<Integer>>(s, new Node<Node<Integer>>(t, null)));
		NodeUtil.printList(NodeUtil.cardinalitaList(list)); //Stampa [0, 3, 6]
		
		System.out.println();
		System.out.println();
		System.out.println("-----Prova con liste di double------");
		
		Node<Double> a = null;
		Node<Double> b = new Node<Double>(1.0,new Node<Double>(2.0,new Node<Double>(3.0,new Node<Double>(4.0, new Node<Double>(5.0, new Node<Double>(1.0, null))))));
		Node<Double> c = new Node<Double>(1.0,new Node<Double>(2.0,new Node<Double>(3.0,null)));
		System.out.println("Lunghezza: " + NodeUtil.size(b));
		System.out.println("Occorrenze di " + 1.0 + ": " + NodeUtil.occurences(b, 1.0));
		System.out.println("Incluso: " + NodeUtil.included(c,b));
		System.out.print("Inversa: "); 
		NodeUtil.printList(NodeUtil.reverse(b)); 
		System.out.println();
		NodeUtil.printList(b);
		Node<Node<Double>> listD = new Node<Node<Double>>(a, new Node<Node<Double>>(b, new Node<Node<Double>>(c, null)));
		NodeUtil.printList(NodeUtil.cardinalitaList(listD)); 
		
		System.out.println();
		System.out.println();
		System.out.println("-----Prova con liste di stringhe------");
		
		Node<String> d = null;
		Node<String> e = new Node<String>("a",new Node<String>("2.0",new Node<String>("3.0",new Node<String>("4.0", new Node<String>("5.0", new Node<String>("1.0", null))))));
		Node<String> f = new Node<String>("1.0",new Node<String>("2.0",new Node<String>("3.0",null)));
		System.out.println("Lunghezza: " + NodeUtil.size(e));
		System.out.println("Occorrenza di " + e + ": " + NodeUtil.occurences(e, "1.0"));
		System.out.println("Incluso: " + NodeUtil.included(f,e));
		System.out.print("Inversa: "); 
		NodeUtil.printList(NodeUtil.reverse(f));
		System.out.println();
		NodeUtil.printList(f); 
		Node<Node<String>> listS = new Node<Node<String>>(d, new Node<Node<String>>(e, new Node<Node<String>>(f, null)));
		NodeUtil.printList(NodeUtil.cardinalitaList(listS)); 
		
		System.out.println();
		System.out.println();
		System.out.println("-----Prova con liste di persone------");
		//creo gli oggetti di tipo Person
		Person pippo = new Person("Pippo", "Baudo");
		Person pinco = new Person("Pinco", "Pallo");
		Person sbro = new Person("Sbro", "Dero");
		Person ciccio = new Person("Ciccio", "Gamer");
		Person alborto = new Person("Alborto", "Station");
		
		
		Node<Person> g = null;
		Node<Person> h = new Node<Person>(pippo,new Node<Person>(pinco,new Node<Person>(sbro,new Node<Person>(ciccio, new Node<Person>(alborto, new Node<Person>(alborto, null))))));
		Node<Person> i = new Node<Person>(alborto,new Node<Person>(sbro,new Node<Person>(ciccio,null)));
		System.out.println("Lunghezza: " + NodeUtil.size(h));
		System.out.println("Occorrenze di " + alborto + ": " + NodeUtil.occurences(h, alborto));
		System.out.println("Incluso: " + NodeUtil.included(i,h));
		System.out.print("Inversa: "); 
		NodeUtil.printList(NodeUtil.reverse(h));
		System.out.println();
		NodeUtil.printList(h); 
		Node<Node<Person>> listP = new Node<Node<Person>>(g, new Node<Node<Person>>(h, new Node<Node<Person>>(i, null)));
		NodeUtil.printList(NodeUtil.cardinalitaList(listP)); 
	}
}