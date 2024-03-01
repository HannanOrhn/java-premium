import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int reduce = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce = " + reduce);

        Optional<Integer> reduce2 = numbers.stream()
                .reduce( (a, b) -> a + b);
        System.out.println("reduce = " + reduce);

        //Max ,min ,and sum
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println("min = " + min);

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("max = " + max);

        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("sum = " + sum);
    }
}
