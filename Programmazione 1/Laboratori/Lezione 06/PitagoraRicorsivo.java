public class PitagoraRicorsivo {

	public static void stampaElemento(int r, int c) {
		if (c > 10) {
			System.out.println();
			return;
		}
		else {
			System.out.format("%4d", r * c);
			stampaElemento(r, c + 1);
		}
	}

	public static void stampaRigaTavola(int r) {
		if (r > 10)
			return;

		// ricorsione sulle colonne della riga r
		stampaElemento(r, 1);
		stampaRigaTavola(r + 1);
	}

	public static void tavolaPitagorica() {
		// ricorsione sulle righe
		stampaRigaTavola(1);
	}
	
	public static void main(String[] args) {
		tavolaPitagorica();
	}
}