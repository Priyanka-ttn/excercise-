import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
        list.
                stream().
                filter(e->{
                    System.out.println(e);
                    return e>1;
                }).findFirst()
                );
    }

}
