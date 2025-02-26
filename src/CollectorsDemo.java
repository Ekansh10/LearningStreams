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

        // 2) Collecting to Set
        List<Integer> nums = Arrays.asList(1,2,4,5,3,2,2,3,1,4,6,7,3,5,6,8);
        Set<Integer> newNums = nums.stream().collect(Collectors.toSet());
        System.out.println(newNums);
    }
}
