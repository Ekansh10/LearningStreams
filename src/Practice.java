import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // Question 1: Collecting names by length
        List<String> names = Arrays.asList("Ekansh", "Hero", "Jay", "Pawan", "Atharva", "Parag");
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length, Collectors.toList())));

        // Question 2: Counting word occurences
        String sentence = new String("Hello Mr. Ekansh, Say Hello to this World. Dont you think this world is worth saying Hello?");
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x.replace(",","").replace("?", "").replace(".", "") , Collectors.counting())));

        // Question 3: Partitioning even and odd numbers
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        System.out.println(nums.stream().collect(Collectors.partitioningBy(x -> x%2==0)));

        // Question 4: Summing Values in a map
        Map<String, Integer> items = new HashMap<String,Integer>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);

        System.out.println(items.values().stream().reduce((x,y)-> x+y).get());//get because out type is Optional
        //OR
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        
    }
}
