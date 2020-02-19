package javaintro;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        System.out.println("enter the substring to be replaced: ");
        String substr = sc.nextLine();
        System.out.println("enter the substring which will replace: ");
        String newstr = sc.nextLine();
        str = str.replace(substr,newstr);
        System.out.println(str);
    }
}
