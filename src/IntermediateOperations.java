import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit", "Ram", "Shyam", "Ankit");

        // 1) Filter
        long res = names.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        // 2) Map
        List<String> namesUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesUpperCase);

        // 3) Sorted
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        // 4) Distinct
        List<String> distinctNames = names.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNames);

        // 5) Limit
        List<Integer> oneToHundred = Stream.iterate(1, x -> x+1).limit(100).collect(Collectors.toList());
        System.out.println(oneToHundred);

        // 6) Skip
        List<Integer> oneToHundredWithSkipOfTen = Stream.iterate(1, x -> x+1).skip(10).limit(100).collect(Collectors.toList());
        System.out.println(oneToHundredWithSkipOfTen); // This will skip initial 10 elements, thus the list will start form 11 to 110 having 100 elements in total

        // 7) Peek -> Performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1). skip(10).limit(100).peek(System.out::println).count();
    }
}