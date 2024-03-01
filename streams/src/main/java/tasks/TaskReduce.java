package tasks;

public class TaskReduce {
    //count number of dishes in a stream using the map and reduce
    public static void main(String[] args) {
        int numbersOdDishes = DishData.readAll()
                .map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.println("numbersOdDishes = " + numbersOdDishes);

        long count = DishData.readAll()
                .count();
        System.out.println("count = " + count);
    }
}
