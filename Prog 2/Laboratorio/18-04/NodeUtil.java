public class NodeUtil{
	public static <T> int size(Node <T> p){
		Node<T> temp = p;
		int l = 0;
		while(temp != null){
			l++;
			temp = temp.getNext();
		}
		return l;
	}
	
	public static <T> int occurences(Node <T> p, T x){
		Node<T> temp = p;
		int l = 0;
		while(temp != null){
			l = temp.getElem() == x ? l + 1 : l;
			temp = temp.getNext();
		}
		return l;
	}
	
	public static <T> boolean included(Node<T> p, Node<T> q){
		Node<T> temp = p; //Lista temporanea per p
		if(p == null || q == null || temp == null){
			return true;
		}else{
			return (occurences(q, temp.getElem()) != 0) && included(temp.getNext(), q);
		}
	}
	
	public static <T> Node<T> reverse(Node<T> p){
		Node <T> temp = p;
		Node <T> q = null;
        while (temp != null) {
            q = new Node<T> (temp.getElem(), q);
            temp = temp.getNext();
        }
        return q;
	}
	
	public static <T> void printList(Node<T> p){
		Node <T> temp = p;
		System.out.print("Lista: [");
		while(temp != null){
			String space = temp.getNext() == null ? "" : ", ";
			System.out.print(temp.getElem() + space);
			temp = temp.getNext();
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static <T> Node<Integer> cardinalitaList(Node <Node<T>> p){
		Node <Node<T>> temp = p;
		if(p == null || temp == null){
			return null;
		}else{
			return new Node<Integer>(size(temp.getElem()), cardinalitaList(temp.getNext()));
		}
	}
}