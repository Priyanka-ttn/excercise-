package java2;

public class Singleton
{

    private static Singleton obj=new Singleton();
    private Singleton(){}

    public static Singleton getSingleton(){
        return obj;
    }

    public void doSomething(){
        System.out.println("singleton class....");
    }
}
class SingletonDemo{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.doSomething();
    }
}



