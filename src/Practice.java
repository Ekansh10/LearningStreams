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

    }
}
