import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jay", "Ekansh", "Pande", "Puneet");

        Stream<String> snames = names.stream().filter(name -> {
            System.out.println("Filtering: " + name);
            return name.length() > 3;
        });

        System.out.println("Before Filtering");
        List<String> finalNames = snames.collect(Collectors.toList());
        System.out.println("After Filtering");
        System.out.println(finalNames);
    }
}