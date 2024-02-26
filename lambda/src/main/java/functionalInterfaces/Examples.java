package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        //************Predicate JFI*************//
        Predicate<Integer> lessThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<18;
            }
        };
        System.out.println("example predicate");
        System.out.println(lessThan.test(50));
        System.out.println(lessThan.test(15));


        //lambda expression way
        System.out.println("example predicate with lambda expression");
        Predicate<Integer> lessThan2 = p -> p<18;
        System.out.println(lessThan2.test(50));
        System.out.println(lessThan2.test(15));

        //************Consumer JFI*************//
        System.out.println("example consumer");
        Consumer<String> consumer = p -> System.out.println("Student name is " + p);
        consumer.accept("Hannan");

        Consumer<Integer> display = p -> System.out.println(p);
        display.accept(5);

        //************BIConsumer JFI*************//
        System.out.println("example bi consumer");
        BiConsumer<Integer,Integer>  addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(5,6);

        //************Function JFI*************//
        System.out.println("example function");
        Function<String,String> fun = s -> "Hello " + s;
        fun.apply("Hannan");

        //************Function JFI*************//
        System.out.println("example function");
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
