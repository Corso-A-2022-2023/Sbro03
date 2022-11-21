public class MassimoInteroRicorsivo {

	public static int maxInt() {
		// leggo da tastiera
		int i = SIn.readInt();

		// caso base
		if (i == 0)
			return Integer.MIN_VALUE;

		// passo induttivo
		int j = maxInt();
		return Math.max(i, j);
	}

	public static void main(String[] args) {
		System.out.println("Il massimo intero inserito e': "+maxInt());
	}
}