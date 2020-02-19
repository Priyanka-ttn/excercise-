package javaintro;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        int count = 0, count1=0 , count2 =0, count3=0;
        int perc =0, perc1=0 , perc2=0,perc3=0;
        int len = str.length();
        for(int i=0; i<len;i++)
        {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){

                count++;

            }
            else if(Character.isUpperCase(ch)){

                count1++;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=57  ){

                count2++;
            }
            else
            {

                count3++ ;
            }
        }

        System.out.println("number of lower case: "+count + " and perc: " + (count*100/len));
        System.out.println("number of upper case: "+count1 + " and perc: " + (count1*100/len));
        System.out.println("number of digits: "+count2 + " and perc: " + (count2*100/len));
        System.out.println("number of special case: "+count3 + " and perc: " + (count3*100/len));
    }
}
