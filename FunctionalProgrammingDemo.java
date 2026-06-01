import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Lambda Expression
        System.out.println("Numbers in the list:");
        numbers.forEach(n -> System.out.println(n));

        // Stream API
        int sum = numbers.stream()
                        .filter(n -> n > 20)
                        .mapToInt(Integer::intValue)
                        .sum();

        System.out.println("Sum of numbers greater than 20: " + sum);
    }
}