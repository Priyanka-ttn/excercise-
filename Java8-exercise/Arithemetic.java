interface mul{
    int mul(int a, int b);
}
interface Add{
    int add(int a, int b);
}
interface Sub{
    int sub(int a, int b);
}
class Arithmetic  {


    public static int mul(int a, int b) {
     return a*b;
    }

    public  int add(int a, int b) {
        return a+b;
    }


    public  int sub(int a, int b) {
        return a+b;
    }



    public static void main(String[] args) {
        Arithmetic art = new Arithmetic();
       mul multiplication = Arithmetic::mul;
        Add add = art::add;
        Sub sub = art::sub;
        int result1 = multiplication.mul(10, 20);
        int result2 = sub.sub(10, 20);
        int result3 = add.add(1,3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}  