import tasks.Dish;
import tasks.DishData;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        //All Match
        System.out.println("******* All match ********" );
        boolean isHealthy = DishData.readAll()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println("isHealthy = " + isHealthy);

        //Any Match
        System.out.println("******* Any match ********" );
        if(DishData.readAll().anyMatch(dish->dish.isVegetarian())){
            System.out.println("Menu is vegan friendly");
            DishData.readAll()
            .filter(Dish::isVegetarian)
            .forEach(System.out::println);


            //None Match
            System.out.println("******* None match ********" );
            if (DishData.readAll().noneMatch(d->d.getCalories()>5000)){
                System.out.println("No matching data has been found");
            }

            //Find Any
            System.out.println("******* Find Any ********" );
            Optional<Dish> any = DishData.readAll()
                    .filter(Dish::isVegetarian)
                    .findAny();
            System.out.println("any = " + any);

            //we use optional class as a data type if it doesn't return any data it will prevent null pointer exception


            //Find Any
            System.out.println("******* Find First ********" );
            Optional<Dish> f = DishData.readAll()
                    .filter(p -> p.getName().startsWith("F"))
                    .findFirst();
        }

    }
}
