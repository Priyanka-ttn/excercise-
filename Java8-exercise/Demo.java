import java.util.function.Supplier;

public class Demo {
    interface Test{
        int display(int a, int b);
    }

    interface Test1{
        int display(int a, int b);
    }
    private int operate(int a, int b, Test t)
    {
        return t.display(a, b);
    }

    public static void main(String[] args) {
        Test add = (int a, int b)-> a+b;
        System.out.println(add.display(3,5));
        Test mul = (int a, int b)-> a*b;
        System.out.println(mul.display(3,7));
        Test1 sub = (int a, int b)-> a-b;
        System.out.println(sub.display(3,5));
        Test1 div = (int a, int b)-> a/b;
        System.out.println(div.display(3,7));

        Demo demo = new Demo();
        System.out.println( demo.operate(3, 6,mul));


    }
}
