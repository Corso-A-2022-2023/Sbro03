// classe per rappresentare una diramazione

public class Branch extends Tree {
    private int elem;
    private Tree left;
    private Tree right;

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public boolean empty() {
        return false;
    }

    public int max() {
        return right.empty() ? elem : right.max();
    }

    public boolean contains(int x) {
        if (x == elem)
            // abbiamo trovato l'elemento
            return true;
        else if (x < elem)
            // siccome x e` piu` piccolo di elem cerchiamo x solo nel
            // sottoalbero sinistro
            return left.contains(x);
        else
            // siccome x e` piu` grande di elem cerchiamo x solo nel
            // sottoalbero destro
            return right.contains(x);
    }

    public Tree insert(int x) {
        if (x < elem)
            left = left.insert(x);
        else if (x > elem)
            right = right.insert(x);
        // se x == elem x e` gia` presente nell'albero e non lo inseriamo
        return this;
    }

    public Tree remove(int x) {
        if (x == elem) // trovato elemento da eliminare
            if (left.empty())
                // il sottoalbero sinistro e` vuoto, dunque resta il
                // sottoalbero destro
                return right;
            else if (right.empty())
                // il sottoalbero destro e` vuoto, dunque resta il
                // sottoalbero sinistro
                return left;
            else {
                // entrambi i sottoalberi sono non vuoti e dobbiamo
                // individuare un elemento da collocare alla radice
                // dell'albero dopo l'eliminazione di elem. Scegliamo
                // il massimo elemento del sottoalbero sinistro, il
                // quale sara` per definizione piu` grande di tutti
                // gli altri elementi del sottoalbero sinistro e, per
                // la proprieta` degli alberi binari di ricerca, piu`
                // piccolo di tutti gli elementi nel sottoalbero
                // destro. In alternativa sarebbe stato possibile
                // scegliere il minimo elemento del sottoalbero destro
                elem = left.max();
                // eliminiamo l'elemento massimo dal sottoalbero
                // sinistro
                left = left.remove(elem);
                return this;
            }
        else if (x < elem) {
            // se c'e`, l'elemento da eliminare e` nel sottoalbero
            // sinistro
            left = left.remove(x);
            return this;
        } else {
            // se c'e`, l'elemento da eliminare e` nel sottoalbero
            // destro
            right = right.remove(x);
            return this;
        }
    }
    
    public int depth() {
        return 1 + Math.max(left.depth(), right.depth());
    }

    public StringBuilder toStringFigo(StringBuilder prefix, boolean isTail, StringBuilder sb) {
		String branch = isTail ? ("└── " + elem): ("┌──" + elem);
		if(right!=null) {
			right.toStringFigo(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
		}
		sb.append(prefix).append(branch).append("\n");
		if(left!=null) {
			left.toStringFigo(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
		}
		return sb;
	}
	
	@Override
	public String toString() {
		return this.toStringFigo(new StringBuilder(), true, new StringBuilder()).toString();
	}
	
	public int size(){
		if(left.empty()){
			return 1 + right.size();
		}else if(right.empty()){
			return 1 + left.size();
		}
		return 1 + right.size() + left.size();
	}
	
	public int sum(){
		if(left.empty()){
			return elem + right.sum();
		}else if(right.empty()){
			return elem + left.sum();
		}
		return elem + right.sum() + left.sum();
	}
	
	public boolean contains(int x, int n){
		if(n == 0){
			return x == elem;
		}else{
			return false || right.contains(x, n-1) || left.contains(x, n-1);
		}
	}
	
	public boolean balanced(){
		if(right.depth() >= 1 + left.depth()){
			return false;
		}else{
			return right.balanced() && left.balanced();
		}
	}
	
	public Tree filter_le(int x){
		if(elem <= x){
			return new Branch(elem, left, right.filter_le(x));
		}else{
			return left.filter_le(x);
		}
	}
	
	public int get(int i){
		assert 	i > 0 && i < size() - 1: "Coglione non funnziono muahahahah";
		if(i == 0){
			return elem;
		}else if(i <= elem){
			return right.empty() ? left.get(i-1) : right.get(i-1);
		}else{
			return left.empty() ? right.get(i-1) : left.get(i-1);
		}
	}
}
