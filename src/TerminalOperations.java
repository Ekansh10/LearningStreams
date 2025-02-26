import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        // 1) Collect
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        List<Integer> intlst = nums.stream().skip(1).collect(Collectors.toList());
        System.out.println(intlst);
        //OR
        nums.stream().skip(1).toList();


        // 2) forEach
        nums.stream().forEach(System.out::println);


        // 3) reduce
        Optional<Integer> sums = nums.stream().reduce((x,y) -> x+y); // can use method refrence Integer::sum
        System.out.println(sums.get());


        // 4) count
        System.out.println(nums.stream().skip(1).count());


        // 5) anyMatch, allMatch, noneMatch
        System.out.println(nums.stream().anyMatch(x -> x%2 ==0));
        System.out.println(nums.stream().allMatch(x -> x%2 ==0));
        System.out.println(nums.stream().noneMatch(x -> x%2 ==0));


        // 6) findFirst, findAny
        System.out.println(nums.stream().skip(1).findFirst().get());
        System.out.println(nums.stream().skip(2).findAny().get());


        // 7) toArray
        Object[] arr = Stream.of(1,2,3,4).toArray();

        // 8) Min / Max
        System.out.println("max: " + Stream.of(3,67,3,24,5,8,9).max(Comparator.naturalOrder()).get());
        System.out.println("min: " + Stream.of(3,67,3,24,5,8,9).min(Comparator.naturalOrder()).get());


        // 9) forEachOrdered
        List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println("forEach Output: ");
        nums2.parallelStream().forEach(System.out::println);
        System.out.println("forEachOrdered Output: ");
        nums2.parallelStream().forEachOrdered(System.out::println);
        // Example : Filtering and Collecting Names
        List<String> names = Arrays.asList("Ajay", "Aditya", "Ekansh", "Piyush", "Suyog");
        System.out.println(names.stream().filter(x -> x.length() > 5).collect(Collectors.toList()));

        // Example : Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(8,2,5,9,0,3,1);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        // Example : Summing Values
        System.out.println(numbers.stream().reduce((x,y) -> x+y).get());

        // Example : Counting Occurrence of Character
        String sentence = "Hello World"; // .chars give stream of ASCII (integer)
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        names.stream().filter(x -> x.startsWith("A"));

        // Example : Can I do This?
        Stream<String> s1 = names.stream();
        s1.forEach(System.out::println); // forEach is a terminal operation (TO)
        // List<String> l1 = s1.map(String::toLowerCase).toList(); 
        // No the above line will give exception as stream s1 is already closed by forEach Terminal Operation


    }
}