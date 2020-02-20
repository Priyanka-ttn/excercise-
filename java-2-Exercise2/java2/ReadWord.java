package java2;

import java.util.Scanner;

public class ReadWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str ="";
//        while(!str.equals("done"))
//        {
//            str = scan.nextLine();
//            if(str.charAt(0)==str.charAt(str.length()-1)){
//                System.out.println("first char is equal to the last char");
//          }
//            System.out.println("Exit");
//        }
        str ="";
        do {
            str = scan.nextLine();
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("first char is equal to the last char");
            }}
         while (!str.equals("done"));
        System.out.println("loop ends here");

    }
}

