public class TesteImpressora {

    public static void main(String[] args) {
        Impressora p = new Impressora();
        int a = 2, b = 3;
        String a1 = "40", b2 ="60" , c3 = "45";
        float a4 = 59.5f, b5 = 63.2f;

        System.out.println(p.exibir(a4));

        System.out.println(p.exibir(a4, b5));

        System.out.println(p.exibir(a4, a1));

        System.out.println(p.exibir(a1, b5));

        System.out.println(p.exibir(a1, b2, c3));

        System.out.println(p.exibir(a, b, c3));

    }
    
}
