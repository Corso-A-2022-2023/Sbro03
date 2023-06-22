import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        Random r = new Random();
        // creo un albero con 10 numeri interi casuali
        Tree t = new Leaf();
        for (int i = 0; i < 10; i++)
            t = t.insert(r.nextInt(20));
        testTreeMethods(t);

        // creo un albero come nel testo della specifica
        Tree t1 = new Branch(3, 
                        new Branch(1, 
                            new Leaf(),
                            new Branch(2,
                                new Leaf(),
                                new Leaf())),
                        new Branch(5,
                            new Leaf(),
                            new Leaf()));
        testTreeMethods(t1);
		
		Tree t2 = new Branch(1, new Branch(2, new Leaf(), new Leaf()), new Branch(3, new Leaf(), new Leaf()));
        testTreeMethods(t2);
    }

    private static void testTreeMethods(Tree t) {
		System.out.println("\n-----------------\n");
        System.out.println("t" + "\n" + t);
        System.out.println("t.empty() = " + t.empty());
        System.out.println("t.max() = " + t.max());
        System.out.println("t.contains(6) = " + t.contains(6));
        System.out.println("t.depth() = " + t.depth());
        // aggiungere le chiamate ai metodi da implementare
		System.out.println("t.size() = " + t.size());
		System.out.println("t.sum() = " + t.sum());
		System.out.println("t.contains(2,2) = " + t.contains(2,2));
		System.out.println("t.contains(5,4) = " + t.contains(5,4));
		System.out.println("t.balanced() = " + t.balanced());
		System.out.println("t.filter_le(2) = " + "\nt\n" + t.filter_le(2));
		for(int i = 0; i < t.size(); i++)
			System.out.println("t.get(" + i + ") = " + t.get(i));
    }
}
