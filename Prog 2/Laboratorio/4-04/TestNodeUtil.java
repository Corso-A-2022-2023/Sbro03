class TestNodeUtil{
	public static void main(String[] args){
		Node n1 = NodeUtil.fromTo(-3, 5);
		NodeUtil.stampa(n1);
		
		Node n2 = new Node(1, new Node(1, new Node(3, new Node(4, new Node(1, null)))));
		System.out.println();
		System.out.println(NodeUtil.occurences(n2,1) == 3);
		
		Node n3 = new Node(1, new Node(3, new Node(4, null)));
		System.out.println(NodeUtil.included(n3, n2));
		
		NodeUtil.stampa(n1);
		System.out.println();
		NodeUtil.stampa(NodeUtil.reverse(n1)); 
		
		Node n4 = new Node(2, new Node(9, new Node(6, null)));
		NodeUtil.stampa(n3);
		NodeUtil.stampa(n4);
		System.out.println();
		NodeUtil.stampa(NodeUtil.zipSum(n3, n4));
	}
}