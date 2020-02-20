package java2;

import java.util.Scanner;

public class Sorting {
    public static void main(String args[])
    {
        char temp;
        int i,j =0;
        Scanner scan = new Scanner(System.in);


        System.out.println("enter a string: ");
        String str = scan.nextLine();
        char word[] = str.toCharArray();


        for(i=0; i<word.length; i++)
        {
            for(j=i+1; j<word.length; j++)
            {
                if(word[i] > word[j])
                {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }

        System.out.print(" Array after Sorting is : ");
        for(i=0; i<word.length; i++)
        {
            System.out.print(word[i]+ "  ");
        }
    }
}
