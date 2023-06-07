public class Cons extends List {
    private int elem;   // Elemento memorizzato
    private List next;  // Riferimento al nodo successore

    public Cons(int elem, List next) {
        this.elem = elem;
        this.next = next;
    }

    public String toString() {
        return elem + ", " + next.toString();
    }

    public List insert(int n, int x) {
        /* COMPLETARE */
    }
}
