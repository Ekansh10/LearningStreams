import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Lambda Expression Example 1
        MathOperations addition = (a, b) -> a + b;
        MathOperations subtraction = (a, b) -> a - b;
        MathOperations multiplication = (a, b) -> a * b;
        MathOperations division = (a, b) -> a / b;
        System.out.println(addition.operation(2, 8));
        System.out.println(subtraction.operation(2, 8));
        System.out.println(multiplication.operation(2, 8));
        System.out.println(division.operation(2, 8));

        // Lambda Expression Example 2 with PREDICATE
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(9));

        Predicate<String> isWordStartingWithA = s -> s.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithA = s -> s.toLowerCase().endsWith("a");
        Predicate<String> bothConditions = isWordStartingWithA.and(isWordEndingWithA);
        System.out.println(bothConditions.test("Ankit"));

        // Lambda Expression Example 3 with FUNCTION
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(10));

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(24));

        // Lambda Expression Example 4 with CONSUMER
        Consumer<Integer> print = System.out::println;
        print.accept(10);

        List<Integer> arr = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printEles = list -> list.forEach(System.out::println);
        printEles.accept(arr);

        // Lambda Expression Example 5 with SUPPLIER
        Supplier<Integer> supplyEle = () -> 999;
        System.out.println(supplyEle.get());

        // Combined Example
        Predicate<Integer> condition = x -> x % 2 == 0;
        Function<Integer, Integer> squareIt = x -> x * x;
        Consumer<Integer> khaliya = System.out::println;
        Supplier<Integer> dediya = () -> 98;

        if (condition.test(dediya.get())) {
            khaliya.accept(squareIt.apply(dediya.get()));
        } else {
            khaliya.accept(-1);
        }

        // BiFunction, BiPredicate, BiConsumer
        BiFunction<String, String, Integer> totalLen = (x, y) -> (x + y).length();
        System.out.println(totalLen.apply("Ekansh", "Mahajan"));

        BiConsumer<String, Integer> khaliya2 = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        khaliya2.accept("Jay", 20);

        BiPredicate<Integer, Integer> condition2 = (x, y) -> (x + y) % 2 == 0;
        System.out.println(condition2.test(11, 11));

        // Unary and Binary Operator
        UnaryOperator<Integer> summingEle = x -> x + 2;
        BinaryOperator<Integer> summingEles = Integer::sum;

        // Method Reference
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(System.out::println);

        // Constructor Reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<Phone> listOfPhones = names.stream().map(Phone::new).collect(Collectors.toList());
    }

    // Made the class static to avoid scope issues
    static class Phone {
        String name;

        public Phone(String s) {
            this.name = s;
        }
    }

    interface MathOperations {
        int operation(int a, int b);
    }
}