public interface NewInterface {
    default void defaultMethod(){
        System.out.println("i am a default method in interface");
    }
    static void staticMethod(){
        System.out.println("i am a static method in interface");
    }
    void myMethod();
    }


class Demotest implements NewInterface{
    @Override
    public void myMethod() {
        System.out.println("Unimplemented method");
    }
    public static void main(String[] args) {
        Demotest demo = new Demotest();
        demo.defaultMethod();
        NewInterface.staticMethod();
        demo.myMethod();
    }


}
