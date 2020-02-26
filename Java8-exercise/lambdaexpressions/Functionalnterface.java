package lambdaexpressions;

public class Functionalnterface {
    interface Test{
        int display(int a, int b);
    }

    public static void main(String[] args) {
       Test add = (int a, int b)-> a+b;
        System.out.println(add.display(8,9));
    }


}
