package javaintro;

public class StaticKeyword {
    static String Firstname;
    static String lastname;
    static int age;
     static {
         Firstname ="Priyanka";
         lastname="Singh";
         age=63;
         System.out.println("i am a static block ");

    }
     static void getDetails(){
         System.out.println(Firstname + " " + lastname);
         System.out.println(age);
    }

    public static void main(String[] args) {
        getDetails();
    }
}
