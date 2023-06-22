class TestDynamicQueue{
	public static void main(String[] args){
		System.out.println("------Prova con liste di interi----");
		
		Node<Integer> t = new Node<Integer>(1,new Node<Integer>(2,new Node<Integer>(3,new Node<Integer>(4, new Node<Integer>(5, new Node<Integer>(1, null))))));
		Node<Integer> s = new Node<Integer>(1,new Node<Integer>(2,new Node<Integer>(3,null)));
		DynamicQueue<Integer> l = new DynamicQueue<Integer>();
		l.enqueue(1);
		l.enqueue(2);
		l.enqueue(3);
		DynamicQueue<Integer> r = new DynamicQueue<Integer>();
		r.enqueue(1);
		r.enqueue(2);
		r.enqueue(3);
		l.scriviOutput();
		r.scriviOutput();
		System.out.println(l.equals(r));
		
		System.out.println();
		System.out.println();
		System.out.println("-----Prova con liste di double------");
		
		Node<Double> a = null;
		Node<Double> b = new Node<Double>(1.0,new Node<Double>(2.0,new Node<Double>(3.0,new Node<Double>(4.0, new Node<Double>(5.0, new Node<Double>(1.0, null))))));
		Node<Double> c = new Node<Double>(1.0,new Node<Double>(2.0,new Node<Double>(3.0,null)));
		 
		
		System.out.println();
		System.out.println();
		System.out.println("-----Prova con liste di stringhe------");
		
		Node<String> d = null;
		Node<String> e = new Node<String>("a",new Node<String>("2.0",new Node<String>("3.0",new Node<String>("4.0", new Node<String>("5.0", new Node<String>("1.0", null))))));
		Node<String> f = new Node<String>("1.0",new Node<String>("2.0",new Node<String>("3.0",null)));
		
		
		System.out.println();
		System.out.println();
		System.out.println("-----Prova con liste di persone------");
		//creo gli oggetti di tipo Person
		Person pippo = new Person("Pippo", "Baudo");
		Person pinco = new Person("Pinco", "Pallo");
		Person sbro = new Person("Sbro", "Dero");
		Person ciccio = new Person("Ciccio", "Gamer");
		Person alborto = new Person("Alborto", "Station");
		
		System.out.println(pippo.equals(pinco));
		
		Node<Person> g = null;
		Node<Person> h = new Node<Person>(pippo,new Node<Person>(pinco,new Node<Person>(sbro,new Node<Person>(ciccio, new Node<Person>(alborto, new Node<Person>(alborto, null))))));
		Node<Person> i = new Node<Person>(alborto,new Node<Person>(sbro,new Node<Person>(ciccio,null)));
		
	}
}