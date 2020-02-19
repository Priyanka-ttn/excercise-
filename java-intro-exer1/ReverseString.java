package javaintro;


public class ReverseString {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Priyankaaaaaa");
        System.out.println( sbf);

        sbf.reverse();
        System.out.println(sbf);

        sbf.delete(4, 9);
        System.out.println(sbf);

    }
}
