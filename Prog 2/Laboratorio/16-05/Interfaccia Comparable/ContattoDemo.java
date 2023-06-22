public class ContattoDemo {
    // verifica i metodi della classe Contatto
    public static void main(String[] args) {
        Contatto a = new Contatto("a","a@ditta");
        System.out.println("Contatto a");
        a.scriviOutput();
        System.out.println("Modifico nome a in a2");
        a.setNome("a2");
        a.scriviOutput();
        System.out.println("Modifico email a in a2@ditta");
        a.setEmail("a2@ditta");
        a.scriviOutput();
        Contatto b = new Contatto("b", "b@ditta");
       System.out.println(a.compareTo(b));
       b.setNome("a2");
       b.setEmail("a2@ditta");
       System.out.println(a.compareTo(b));
        
    }
}