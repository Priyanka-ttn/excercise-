package collection1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueString {
    public static void main(String[] args) {
        Set<String>  str = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        String stringarr[] = string.split(" ");

        for (int i = 0; i <stringarr.length ; i++) {
            str.addAll(Arrays.asList(stringarr));
        }

        for (String string1: str
        ) {
            System.out.print(string1 +" ");
        }

    }
}
