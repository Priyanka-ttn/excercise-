package javaintro;

import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
       int idx =0 ;
        String word[] = str.split( " ");
       String newword[] = new String[10];

        for (int i =0;i<word.length;i++)
        {
            int count=1;

            for(int j=i+1;j<word.length;j++)
            {
                if (word[i].equals(word[j]) && !word[j].equals("-1"))
                {
                    count++;
                    word[j] = "-1";
                }

            }
            if(count>1)
            {
                System.out.println(word[i] + " : " +count);
            }

        }


    }

}
