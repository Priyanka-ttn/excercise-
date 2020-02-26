public interface DefaultOverride {
    default void method(){
        System.out.println("i am a default method in interface");
    }

}
class DemoTest1 implements DefaultOverride {
    @Override
    public void method() {
        System.out.println("i am new default");
    }

    public static void main(String[] args) {
        DemoTest1 dtest = new DemoTest1();
        dtest.method();
    }
}
