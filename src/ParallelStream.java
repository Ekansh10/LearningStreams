import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        List<Integer> nums = Stream.iterate(1, x -> x+1).limit(200000).toList();

        long startTime = System.currentTimeMillis();
        List<Long> factorialList = nums.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Sequential Stream: " + (endTime-startTime) + " ms");

        startTime = System.currentTimeMillis();
        factorialList = nums.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Parallel Stream: " + (endTime-startTime) + " ms");

    }
    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}