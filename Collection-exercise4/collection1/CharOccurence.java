package collection1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string..");
        String str = scan.nextLine();

        char stringarr[] = str.toCharArray();

        HashMap<Character,Integer> hash = new HashMap<Character, Integer>();



        for (char c : stringarr) {
            if(hash.containsKey(c)) {
                hash.put(c, hash.get(c) + 1);
            }

            else {
                hash.put(c, 1);
            }
        }

        for (Map.Entry i : hash.entrySet()) {
            System.out.println("key: " + i.getKey() + " value: " + i.getValue());
        }

    }
}
