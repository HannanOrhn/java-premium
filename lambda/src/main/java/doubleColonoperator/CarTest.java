package doubleColonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    //We call constructor in lambda expression
    public static void main(String[] args) {
        //Zero Argument
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One Argument
        Function<Integer,Car> c3 = (model) -> new Car();
        Car bmw = c3.apply(2000);
        System.out.println(bmw.getModel());

        //Two Argument
        BiFunction<String,Integer,Car> c4 = (make, model) -> new Car(make,model);
        Car honda = c4.apply("Honda",2003);
        System.out.println(honda.getMake() + " " + honda.getModel());
    }
}
