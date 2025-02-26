import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.*;
public class CollectorsDemo {
    public static void main(String[] args) {
        // 1) Collecting to List
        List<String> names = Arrays.asList("Ekansh", "Jay", "Ram", "Shyam", "Rohit");
        List<String> newNames = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(newNames);

        // 2) Collecting to Set
        List<Integer> nums = Arrays.asList(1,2,4,5,3,2,2,3,1,4,6,7,3,5,6,8);
        Set<Integer> newNums = nums.stream().collect(Collectors.toSet());
        System.out.println(newNums);

        // 3) Collecting to a Specific Collection
        ArrayDeque<String> arrNames = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(arrNames);

        // 4) Joining Strings
        String concatenatedNames = names.stream().collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5) Summarizing Data
        IntSummaryStatistics stats = nums.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: "+ stats.getCount());
        System.out.println("Min: "+ stats.getMin());
        System.out.println("Max: "+ stats.getMax());
        System.out.println("Average: "+ stats.getAverage());
        System.out.println("Sum: "+ stats.getSum());

    }
}
