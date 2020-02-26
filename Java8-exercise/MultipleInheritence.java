public class MultipleInheritence implements TestInterface1,TestInterface2 {
    public void show() {
        TestInterface2.super.show();
        TestInterface2.super.show();
    }

    public static void main(String args[]) {
        MultipleInheritence d = new MultipleInheritence();
        d.show();
    }
}
interface TestInterface1
{
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}
