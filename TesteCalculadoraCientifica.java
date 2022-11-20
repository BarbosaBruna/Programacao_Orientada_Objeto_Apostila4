public class TesteCalculadoraCientifica {

    public static void main(String[] args) {
        CalculadoraCientifica c = new CalculadoraCientifica();
        float a1 = 2.5f, b1 = 5.5f;
        int a2 = 3, b2 = 5;
        double a3 = 4, b3 = 64, c3 = 169;
        String a4 = "8", b4 = "10";

        System.out.println(c.calc(a1, b1));

        System.out.println(c.calc(a2, b2));

        System.out.println(c.calc(a1, b2));

        System.out.println(c.calc(a2, b1));

        System.out.println(c.raiz(a3));

        System.out.println(c.raiz(b3));

        System.out.println(c.raiz(c3));

        System.out.println(c.pontencia(a3, b3));

        System.out.println(c.pontencia(a4, b4));

        System.out.println(c.potencia(a2, b3));

    }
}
