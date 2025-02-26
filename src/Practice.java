import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // Question 1: Collecting names by length
        List<String> names = Arrays.asList("Ekansh", "Hero", "Jay", "Pawan", "Atharva", "Parag");
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length, Collectors.toList())));

    }
}
