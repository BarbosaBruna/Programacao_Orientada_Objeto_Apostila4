public class CalculadoraCientifica {

    public float calc(float a, float b) {
        return (a * b / 2) * 2;
    }

    public int calc(int a, int b) {
        return (a * b / 2) * 2;
    }

    public float calc(float a, int b) {
        return (a * b / 2) * 2;
    }

    public float calc(int a, float b) {
        return (a * b / 2) * 2;
    }

    public int raiz(int a) {
        return (int) Math.sqrt(a);
    }

    public double raiz(double a) {
        return Math.sqrt(a);
    }

    public double raiz(String a) {
        return Double.parseDouble(a);

    }

    public double pontencia(double a, double b) {
        return Math.pow(a, b);
    }

    public String pontencia(String s1, String s2) {
        Double.parseDouble(s1);
        Double.parseDouble(s2);
        return Math.pow(s1, s2);

    }

    public double potencia(int a, double b) {
        return Math.pow(a, b);
    }

}
