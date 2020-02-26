package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,12,3,4,5);

        System.out.println(

                list.stream().filter(e->e>5).collect(Collectors.summingInt(e->e)) );

    }
}
