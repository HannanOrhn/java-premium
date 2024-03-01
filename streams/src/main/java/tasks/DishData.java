package tasks;

import java.util.stream.Stream;

public class DishData {
    public static Stream<Dish> readAll(){
        return Stream.of(
                Dish.builder().name("Green Lentil Pasta").type(Type.OTHER).vegetarian(true).calories(230).build(),
                Dish.builder().name("Fish and Chips").type(Type.FISH).vegetarian(false).calories(3000).build(),
                Dish.builder().name("Fish").type(Type.FISH).vegetarian(false).calories(100).build(),
                Dish.builder().name("Salad").type(Type.OTHER).vegetarian(true).calories(120).build(),
                Dish.builder().name("Hamburger").type(Type.MEAT).vegetarian(true).calories(650).build(),
                Dish.builder().name("Tomato Soup").type(Type.OTHER).vegetarian(true).calories(50).build()
        );
    }
}
