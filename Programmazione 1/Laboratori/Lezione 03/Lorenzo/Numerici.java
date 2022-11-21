
public class Numerici {

    public static void main(String[] args) {

        //------------------------
        System.out.println("------ No virgola mobile con uso atteso");

        int i = 99;
        System.out.println("i:" + i);
        i = i + 1;
        System.out.println("i:" + i);
        System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE:" + Integer.MIN_VALUE);

        long l = 200000;
        System.out.println("l:" + l);
        l = l + 1;
        System.out.println("l:" + l);
        System.out.println("Long.MAX_VALUE:" + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE:" + Long.MIN_VALUE);

        //------------------------
        System.out.println();
        System.out.println("------ No virgola mobile con uso un po' meno atteso");

        byte b = 99;
        System.out.println("b:" + b);
        b = (byte) (b + 1); // 'cast' necessario perche' '+' restituisce 'int' per default
        System.out.println("b:" + b);
        System.out.println("Byte.MAX_VALUE:" + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE:" + Byte.MIN_VALUE);

        short s = 99;
        System.out.println("s:" + s);
        s = (short) (s + 1); // 'cast' necessario perche' '+' restituisce 'int' per default 
        System.out.println("s:" + s);
        System.out.println("Short.MAX_VALUE:" + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE:" + Short.MIN_VALUE);

        //------------------------
        System.out.println();
        System.out.println("------ Virgola mobile con uso un po' meno atteso");

        float f = 2.3f;
        System.out.println("f:" + f);
        f = f + 1;
        System.out.println("f:" + f);
        System.out.println("Float.MAX_VALUE:" + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE:" + Float.MIN_VALUE);

        double d = 2.3;
        System.out.println("d:" + d);
        d = d + 1;
        System.out.println("d:" + d);
        System.out.println("Double.MAX_VALUE:" + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE:" + Double.MIN_VALUE);

        //------------------------
        System.out.println();
        System.out.println("------ Divisione e tipi numerici");
        System.out.println("Divisione intera (3*9+0)/3: " + ((3 * 9 + 0) / 3));
        System.out.println("Divisione intera (3*9+1)/3: " + ((3 * 9 + 1) / 3));
        System.out.println("Divisione intera (3*9+2)/3: " + ((3 * 9 + 2) / 3));

        System.out.println("Modulo divisione intera (3*9+0)/3: " + ((3 * 9 + 0) % 3));
        System.out.println("Modulo divisione intera (3*9+1)/3: " + ((3 * 9 + 1) % 3));
        System.out.println("Modulo divisione intera (3*9+2)/3: " + ((3 * 9 + 2) % 3));

        System.out.println("Divisione non intera (3*9+1)/3f: " + ((3 * 9 + 1) / 3f));
        System.out.println("Divisione non intera (3*9+1)/3.0: " + ((3 * 9 + 1) / 3.0));
        System.out.println("Divisione non intera (3*9+1)/3d: " + ((3 * 9 + 1) / 3d));

        System.out.println("Divisione non intera (3*9+1f)/3: " + ((3 * 9 + 1f) / 3));
        System.out.println("Divisione non intera (3*9+1.0)/3: " + ((3 * 9 + 1.0) / 3.0));
        System.out.println("Divisione non intera (3*9+1d)/3: " + ((3 * 9 + 1d) / 3));

        System.out.println("Divisione (double) (3*9+0)/3: " + (double) ((3 * 9 + 0) / 3));
        System.out.println("Divisione (double) (3*9+1)/3: " + (double) ((3 * 9 + 1) / 3));
        System.out.println("Divisione (double) (3*9+2)/3: " + (double) ((3 * 9 + 2) / 3));

        System.out.println("Divisione (float) (3*9+0)/3: " + (float) ((3 * 9 + 0) / 3));
        System.out.println("Divisione (float) (3*9+1)/3: " + (float) ((3 * 9 + 1) / 3));
        System.out.println("Divisione (float) (3*9+2)/3: " + (float) ((3 * 9 + 2) / 3));
    }
}
