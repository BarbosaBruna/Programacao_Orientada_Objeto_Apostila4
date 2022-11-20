public class Impressora {

    public float exibir (float a){
      return a;
    }

    public float exibir (float a, float b){
       return a + b ;
    }
    public float exibir (float a, String b){
        return a + Integer.parseInt(b);
    }
    public float exibir (String a, float b){
        return Integer.parseInt(a) + b;
    }
    public int exibir (String a, String b, String c){
       return Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c); 
    }
    public int exibir (int a, int b, String c){
        return a + b + Integer.parseInt(c);
    }
    
}
