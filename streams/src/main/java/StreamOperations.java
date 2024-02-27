import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        //we can print stream by using foreach
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8);
        //myList.forEach(x -> System.out.println(x));
        //or
        //this foreach is an abstract method in stream interface
       // myList.forEach(System.out::println);

        System.out.println("*************** FILTER *****************");
        Stream<Integer> stream = myList.stream();
        //foreach is a terminal operations to stop stream flow
        stream.filter(i->i%3==0).forEach(System.out::println);

        //we can implement more than one intermediate operations
        myList.stream()
                .filter(i->i%3==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("*************** LIMIT *****************");
        myList.stream()
                .filter(p->p%2==0)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("*************** SKIP *****************");
        myList.stream()
                .filter(p->p%2==0)
                .skip(2)
                .forEach(System.out::println);


        System.out.println("*************** MAP *****************");
        myList.stream()
                .map(n -> n *2)
                .filter(i->i%3==0)
                .forEach(System.out::println);

    }
}
