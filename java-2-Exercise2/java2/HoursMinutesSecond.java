package java2;



import java.util.Scanner;

public class HoursMinutesSecond {

    public static void main(String[] args) {
        int secondsInHours = 60*60;
        int secondsInMinustes = 60;


        System.out.println("enter seconds...");
        Scanner scan = new Scanner(System.in);
        int inputSec = scan.nextInt();

        int hours = inputSec/secondsInHours;
        int remainingSec = inputSec -(hours *secondsInHours);
        int minutes = remainingSec/secondsInMinustes;
        remainingSec = remainingSec -(minutes*secondsInMinustes);
        int seconds = remainingSec;

        System.out.println(hours+","+minutes+","+seconds);

    }
}
