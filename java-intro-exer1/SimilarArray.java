package javaintro;

import java.util.Scanner;

public class SimilarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String word[] = str1.split("");
        String word1[] = str2.split("");

        for(int i=0;i<word.length;i++)
        {
            for (int j = 0; j <word1.length ; j++) {
                if(word[i].equals(word1[j])){
                    System.out.print(word1[j]+" ");

                }
            }
        }
    }
}
