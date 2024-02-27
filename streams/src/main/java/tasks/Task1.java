package tasks;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    //Given a list of words, print the number of characters for each word.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hope","honest","happiness","sunshine");
        findChar(words);
    }
    public static void findChar(List<String> list){
        list.stream()
                .forEach(p-> System.out.println(p.length()));
        System.out.println("*************************************");
        //or
        list.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
