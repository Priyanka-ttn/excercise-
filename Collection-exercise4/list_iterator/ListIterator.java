package list_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListIterator {
    public static void main(String[] args) {
        Float sum = 0f;
        List<Float> list = new ArrayList<Float>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextFloat());
        }

//        for (Float number: list){
//            System.out.println(number);
//        }

        Iterator<Float> it = list.iterator();

        while(it.hasNext()){
            sum += it.next();
        }
        System.out.println("sum : "+ sum);
    }
}
