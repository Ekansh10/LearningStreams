import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.*;
public class CollectorsDemo {
    public static void main(String[] args) {
        // 1) Collecting to List
        List<String> names = Arrays.asList("Ekansh", "Jay", "Ram", "Shyam", "Rohit");
        List<String> newNames = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(newNames);

        
    }
}
