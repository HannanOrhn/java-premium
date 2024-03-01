package tasks;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        //print all the cities in the s tate list
        System.out.println("*** print all the cities in the state list ***");
        StateData.readAll()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("********** or ************");

        StateData.readAll()
                .flatMap(state -> state.getCities().stream())
                .forEach(System.out::println);
    }
}
