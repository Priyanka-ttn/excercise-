package javaintro;

import java.util.Scanner;

public class OddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemnets in array : ");

        int arr[] = new int [5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        int res = 0;
        for (int i : arr) {
            res ^= i;
        }

        System.out.println(res);

    }
}
