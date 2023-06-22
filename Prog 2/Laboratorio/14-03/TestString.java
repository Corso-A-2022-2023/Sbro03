public class TestString {

    // ritorna la stringa piu' lunga in un array di stringhe
    public static String longest(String[] s) {
	 assert s != null && s.length > 0: "l'array deve esistere e avere lunghezza >= 1"; 
     String ris = "";
		for(int i = 0; i < s.length; i++){
			assert s[i] != null : "gli elementi devono esistere";
			ris = s[i].length() > ris.length() ? s[i] : ris;
		}
	 assert s != ris : "c'è stato un errore di valutazione";
		return ris;
    }

    // ritorna la concatenazione di tutte le stringhe nell'array s
    public static String concatAll(String[] s) {
	   assert s != null && s.length > 0: "l'array deve esistere e avere lunghezza >= 1"; 
       String ris = s[0];
		for(int i = 1; i < s.length; i++){
			assert s[i] != null : "gli elementi devono esistere";
			ris = ris.concat(s[i]);
		}
		return ris;
    }

    // elimina gli spazi iniziali e finali della stringa @s
    public static String trim(String p) {
		assert p != "" : "la Stringa non deve essere vuota";
		int inizio = 0;
		int fine = 0;
		for (int i = 0; i < p.length() && inizio == 0; i++) {
			if (p.charAt(i) != ' ')
				inizio = i;
		}
		for (int j = p.length() - 1; j >= 0 && fine == 0; j--) {
			if (p.charAt(j) != ' ')
				fine = j;
		} 
		return p.substring(inizio, fine+1);
	}

   /* // testa i tre metodi utilizzando gli argomenti passati a java sulla riga di comando
    public static void main(String[] args) {
        System.out.println("longest =       |" + longest(args) + "|");
        System.out.println("concatAll =     |" + concatAll(args) + "|");
        assert args.length > 0;
        System.out.println("trim(args[0]) = |" + trim(args[0]) + "|");
    }*/

    // testa i tre metodi
	    public static void main(String[] args) {
			String[] a = {" corto  ", "il più lungo", "cattivo"};

			String pl = longest(a);
	        if (pl != a[1]) System.out.println("longest (SBAGLIATO) =     |" + pl + "|");

	        String ca = concatAll(a);
	        if (!(ca.equals(a[0]+a[1]+a[2]))) System.out.println("concatAll (SBAGLIATO) =     |" + ca + "|");

	        assert a.length > 0;
	        String tr = trim(a[0]);
	        if(!(tr.equals("corto")))System.out.println("trim (SBAGLIATO) =     |" + tr + "|");
    }
}