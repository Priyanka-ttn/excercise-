package compare;


import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        List<ArrayElement> arr = new ArrayList<>();
        arr.add(new ArrayElement(1,"A"));
        arr.add(new ArrayElement(10,"B"));
        arr.add(new ArrayElement(10,"C"));
        arr.add(new ArrayElement(9,"D"));
        arr.add(new ArrayElement(18,"E"));

        Collections.sort(arr, new Comparator<ArrayElement>() {
            @Override
            public int compare(ArrayElement o1, ArrayElement o2) {
                if(o1.getFrequency()>o2.getFrequency())
                {
                    return 1;
                }
                else if(o1.getFrequency()<o2.getFrequency())
                {
                    return -1;
                }

                return 0;
            }
        });
        for (ArrayElement array : arr) {
            System.out.println("Array sorted Frequency: "+ array.getFrequency()+" : "+array.getName());
        }


    }
}
class ArrayElement{
    private int frequency;
    private String name;

    public ArrayElement(int frequency, String name) {
        this.frequency = frequency;
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}