package java2;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args )  {

        Scanner scan =new Scanner(System.in);
        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            int div = a/b;
        }
        catch (InputMismatchException e)
        {
            System.out.println("invalid input");
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            System.out.println("errorrr........do not enter b=0");
            e.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("i will execute always.......");
        }

    }

}
