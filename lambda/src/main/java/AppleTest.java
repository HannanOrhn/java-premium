import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> appleInventory = new ArrayList<Apple>();
        appleInventory.add(new Apple(Color.GREEN,300));
        appleInventory.add(new Apple(Color.RED,100));
        appleInventory.add(new Apple(Color.GREEN,200));
        appleInventory.add(new Apple(Color.RED,50));
        appleInventory.add(new Apple(Color.GREEN,50));

        List<Apple> heavyApples = filterApples(appleInventory,new AppleHeavyPredicate());
        System.out.println(heavyApples);

        List<Apple> greenApples = filterApples(appleInventory, new AppleGreenColorPredicate());
        System.out.println(greenApples);

        //Lambda
        System.out.println("Lambda expression solution for heavy apples");
        filterAppleWithLambda(appleInventory,p->p.getWeight()>150);

        System.out.println("Lambda expression solution for green apples");
        filterAppleWithLambda(appleInventory,p->p.getColor().equals(Color.GREEN));

    }

    //Behavior Parameterization
    private static List<Apple> filterApples(List<Apple> appleInventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleInventory) {
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    private static void filterAppleWithLambda(List<Apple> apples, Predicate<Apple> predicate){
        for (Apple apple : apples){
            if (predicate.test(apple)){
                System.out.println(apple);
            }
        }
    }
}
