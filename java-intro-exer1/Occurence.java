package javaintro;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        Occurence occ = new Occurence();
        System.out.println(occ.occurencemethod(ch,str,0,0));

    }

     int occurencemethod(char ch, String str ,int idx, int count) {
        if(idx == str.length()){
            return count;
        }
        else {
            if(ch == str.charAt(idx))
            {
                count++;
            }
            return occurencemethod(ch,str,idx+1,count);
        }
    }
}
