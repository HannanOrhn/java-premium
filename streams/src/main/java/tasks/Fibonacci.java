package tasks;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(8);
        System.out.println("*******************");
        fibonacci(10);
        System.out.println("*******************");
        fibonacci2(6);
        System.out.println("*******************");
        fibonacci2(9);
    }
    public static void fibonacci(int limitFibonacci){
        //How does it work? Iterate needs a lambda to specify the successor element
        //In the case of tuple (3,5) the successor (5,3+5) = (5,8)

        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(limitFibonacci)
                .forEach(t-> System.out.println("(" + t[0] + " , " + t[1] + ")"));
    }

    public static void fibonacci2(int limitFibonacci){
        Stream.iterate(new int[]{0,1},t -> new int[] {t[1],t[0]+t[1]})
                .limit(limitFibonacci)
                .map(t->t[0])
                .forEach(System.out::println);
    }
}
