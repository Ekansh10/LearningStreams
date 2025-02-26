import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // Generic Example 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // OLD METHOD
//        int count = 0;
//        for(Integer i : numbers){
//            if (i % 2 == 0){
//                count++;
//            }
//        }

        // Using Streams
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());


        // Creating Stream
        //1) From Collections
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> slst = lst.stream();

        // 2) From Arrays
        String[] arr = {"A", "B", "C"};
        Stream<String> sarr = Arrays.stream(arr);

        // 3) Direct Method using Stream.of()
        Stream<String> sarr1 = Stream.of("a", "b");

        //4) Infinite Stream
        // A
        Stream<Integer> sarr2 = Stream.generate(() -> 1).limit(100);

        // B
        List<Integer> sarr3 = Stream.iterate(0, x -> x+1).limit(100).collect(Collectors.toList());
        System.out.println(sarr3);


    }

}