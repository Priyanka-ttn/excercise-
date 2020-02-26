package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println(

                list.stream().collect(Collectors.averagingInt(e->e*2)) );

    }
}
