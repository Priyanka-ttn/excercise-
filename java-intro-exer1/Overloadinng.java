package javaintro;



public class Overloadinng {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(String a, String b){
        System.out.println(a+b);
    }
    void add(String a, String b,String c){
        System.out.println(a+b+c);
    }
    void mul(float a , float b){
        System.out.println(a*b);
    }
    void mul(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
    Overloadinng o = new Overloadinng();
    o.add(2,3);
    o.add(2.2,4);
    o.add("priya","nka");
    o.add("r","el","ax");
    o.mul(2,7);
    o.mul(4.0f,5.76f);

    }
}
