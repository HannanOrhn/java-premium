package appleTaskWithBehaviorParameterization;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> appleInventory = new ArrayList<>();
        appleInventory.add(new Apple(200,Color.RED));
        appleInventory.add(new Apple(500,Color.RED));
        appleInventory.add(new Apple(50,Color.RED));
        appleInventory.add(new Apple(100,Color.RED));
        appleInventory.add(new Apple(200,Color.GREEN));
        appleInventory.add(new Apple(151,Color.GREEN));

        AppleSimpleFormatter appleSimpleFormatter = new AppleSimpleFormatter();
        prettyPrintApple(appleInventory, appleSimpleFormatter);

        AppleFancyFormatter appleFancyFormatter = new AppleFancyFormatter();
        prettyPrintApple(appleInventory, appleFancyFormatter);
    }

    public static void prettyPrintApple(List<Apple> apples, AppleFormatter appleFormatter){
        for (Apple apple: apples){
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }
}
