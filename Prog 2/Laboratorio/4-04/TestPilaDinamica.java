class TestPilaDinamica{
	
	public static void stampaArray(int[] a){
		System.out.print("{ ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
	
	public static PilaDinamica initPila(PilaDinamica p, int n){
		for(int i = 0; i < n; i++){
			p.push(i);
		}
		return p;
	}
	
	public static void main(String[] args){
		PilaDinamica p = new PilaDinamica();
		p = initPila(p, 5);
		stampaArray(p.toArray());
		PilaDinamica ris = fromTo(p,1,3);
		stampaArray(ris.toArray());
	}
}