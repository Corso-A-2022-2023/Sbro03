// Esercizio sui tipi di base del linguaggio Java, e sugli operatori
// che ne manipolano i valori.
public class TipiOperatori {

    public static void main(String[] args) {
        int m1 = 3; //assegnamento
        int n1 = m1 + 1; //o m++
        double p = 2.3; // o float p = 4.1f
        long t = 2000000000;

        //operatori + - * / ecc. attenzione: / se chiamato su interi da la divisione intera
        System.out.println("99 / 50  =  " + 99 / 50); // divisione intera
        System.out.println("99 % 50  =  " + 99 % 50); //resto della divisione intera
        System.out.println("99 / 50.0  =  " + 99 / 50.0); // divisione reale
        System.out.println("99.0 / 50  =  " + 99.0 / 50); // divisione reale
        double d = 99;
        int m = 99;
        int n = 50;
        System.out.println("m / n  =  " + m / n); // divisione intera
        System.out.println("d / n  =  " + d / n); // divisione reale
        System.out.println("m / n, con cast su m: " + (double) m / n);
        System.out.println("m / n, con cast sul risultato: " + (double) (m / n));
        
        System.out.println(); // stampa una linea vuota

        //Errori di Overflow
        int max = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + max);
        max = max + 3;
        System.out.println("dopo aver sommato 3 = " + max);

        //Altri tipi
        boolean b = true;
        boolean b1 = false;
        boolean b2 = b && b1; //true || true operatori lazy a cui si contrappongono & e |
        b2 = !b1;
        // Il risultato di un confronto (<,>,<=,>=,==,!=) tra interi e' un boolean
        b2 = m > n;

        // Il tipo char memorizza un singolo carattere (scritto tra apici singoli)
        char c = 'c';
        // Il tipo String memorizza una serie di caratteri (scritti tra apici doppi)
        String s = "stringa";
    }
}
