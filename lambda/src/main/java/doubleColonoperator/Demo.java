package doubleColonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        //Lambda
        Calculate result1 = (x,y) -> Calculator.findSum(x,y);
        result1.calculate(103,30);

        //Double colon
        Calculate result2 = Calculator::findMultiply;
        result2.calculate(20,10);

        //Reference to instance method
        Calculate result3 = (x,y) ->  new Calculator().findMultiply2(x,y);
        result3.calculate(4,6);

        //Double colon
        Calculator calculator = new Calculator();
        Calculate result4 = calculator::findMultiply2;
        result4.calculate(6,7);

        //Lambda
        BiFunction<String,Integer,String> result5 = (str, i) -> str.substring(i);
        System.out.println(result5.apply("Developer", 3));

        //Double colon
        BiFunction<String,Integer,String> result6 = String::substring;
        System.out.println(result6.apply("Hannan", 5));

        //Lambda
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(9);

        //Double colon
        Consumer<Integer> consumer2 = System.out::println;
        consumer2.accept(34);

        //In order to decide interface type, We need to think about method parameter and return type
         BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

        BiFunction<String,String,String> v3 = String::concat;
    }
}
