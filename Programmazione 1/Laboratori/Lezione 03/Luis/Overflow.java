
public class Overflow {

    public static void main(String[] args) {

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        
        // Overflow su 'byte'
        byte b = 0;
        while (true) {
            b = (byte) (b + 1);
            System.out.println("b:" + b);

            // Un modo pessimo per far trascorrere del tempo...
            long ritardo = 0;
            while (ritardo < (Long.MAX_VALUE / 10E10)) {
                ritardo = ritardo + 1;
            }
        }

        // ESERCIZIO: riformulare l'overflow per altri tipi numerici.
    }
}
