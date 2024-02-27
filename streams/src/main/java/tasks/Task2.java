package tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
          Dish.builder().name("Rosto").type(Type.MEAT).vegetarian(false).calories(300).build(),
                Dish.builder().name("Green Lentil Pasta").type(Type.OTHER).vegetarian(true).calories(230).build(),
                Dish.builder().name("Fish and Chips").type(Type.FISH).vegetarian(false).calories(3000).build(),
                Dish.builder().name("Salad").type(Type.OTHER).vegetarian(true).calories(120).build(),
                Dish.builder().name("Hamburger").type(Type.MEAT).vegetarian(true).calories(650).build(),
                Dish.builder().name("Tomato Soup").type(Type.OTHER).vegetarian(true).calories(50).build()
        );

        System.out.println("**************Print all dish's name that has less than 400 calories******************");
        menu.stream()
                .filter(p->p.getCalories()<400)
                .forEach(p-> System.out.println(p.getName()));

        //or
        System.out.println("********************************");
        menu.stream()
                .filter(p->p.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("**************Print the length of the name of each dish******************");
        menu.stream()
                .forEach(p-> System.out.println(p.getName().length()));

        //or
        System.out.println("********************************");
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("**************Print Three High Caloric dishes******************");

        menu.stream()
                .filter(p->p.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("**************Print all dish name that are below 400 calories in sorted******************");
        menu.stream()
                .filter(p->p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        //for the reverse order
        System.out.println("***********************************");
        menu.stream()
                .filter(p->p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
