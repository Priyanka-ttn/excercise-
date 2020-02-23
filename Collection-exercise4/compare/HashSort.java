package compare;

import java.util.*;

public class HashSort {
    public static void main(String[] args) {
        HashMap<String,Double> marks = new HashMap<String, Double>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            marks.put(scan.next(),scan.nextDouble());
        }
        Map<String, Double> hm1 = sortByValue(marks);

        for (Map.Entry<String, Double> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }
    public static  HashMap<String,Double> sortByValue(HashMap<String, Double>marks){
        List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double>> (marks.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<String,Double>>(){

            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {

                return (o1.getValue()).compareTo(o2.getValue());
            }


        });

        HashMap<String, Double> temp = new LinkedHashMap<String, Double>();
        for (Map.Entry<String,Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
