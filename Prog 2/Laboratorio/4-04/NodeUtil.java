class NodeUtil{
	
	public static void stampa(Node p){
		while(p != null){
			System.out.print(p.getElem() + " ");
			p = p.getNext();
		}
		System.out.println();
	}
	
	public static Node fromTo(int n, int m){
		return m >= n ? new Node(n, fromTo(n +1, m)) : null;
	}
	
	public static int occurences(Node p, int x){
		if(p == null){
			return 0;
		}else{
			return p.getElem() == x ? 1 + occurences(p.getNext(), x) : occurences(p.getNext(), x);
		}
	}
	
	public static boolean included(Node p, Node q){
		if(p == null && q == null){
			return true;
		}else if(p == null || q == null){
			return true;
		}else{
			return (occurences(q, p.getElem()) != 0) && included(p.getNext(), q);
		}
	}
	
	public static int length(Node p){
		Node temp = p;
		int l = 0;
		while(temp != null){
			l++;
			temp = temp.getNext();
		}
		return l;
	}
	
	public static Node reverse(Node p){
		Node temp = p;
		Node ris = null;
		int[] tmp = new int[length(p)];
		int i = 0;
		while(temp != null){
			tmp[i++] = temp.getElem();
			temp = temp.getNext();
		}
		for(int e = 0; e < tmp.length; e++){
			ris = new Node(tmp[e], ris); 
		}
		return ris;
	}
	
	public static Node zipSum(Node p, Node q){
		Node tmp = p;
		if(p == null && q == null){
			return null;
		}else if(p == null){
			return q;
		}else if(q == null){
			return p;
		}else if(length(p) == length(q)){
			if(tmp == null){
				return new Node(p.getElem() + q.getElem(), null);
			}else{
				return new Node(p.getElem() + q.getElem(), zipSum(tmp.getNext(), q.getNext()));
			}
		}else return null;
	}
}