public class CalculadoraCientifica {

    public float calc (float a, float b){
        return (a * b/2)* 2;
    }
    public int calc (int a, int b){
        return (a * b/2)* 2;
    }
    public float calc (float a, int b){
        return (a * b/2)* 2;
    }
    public float calc (int a, float b){
        return (a * b/2)* 2;
    }

    public int raiz (int a){
        return a;
    }
    public double raiz (double a){
        return a;
    }




public static void main(String[] args) {
     CalculadoraCientifica c = new CalculadoraCientifica();
    float a1 = 2.5f , b1 = 5.5f;
    int a2 = 3, b2 = 5;

   System.out.println(c.calc(a1, b1));

   System.out.println(c.calc(a2, b2));

   System.out.println(c.calc(a1, b2));

   System.out.println(c.calc(a2, b1));

}

    


  
    }

    

