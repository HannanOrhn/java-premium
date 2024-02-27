package comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //ascending sort
        Collections.sort(list);
        System.out.println(list);

        //descending sort -> we don't have a ready method but Java gives us interface
        //Comparator interface
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Collections.sort(list,(o1,o2) -> (o1>o2)? -1:(o2<o1)? 1:0);

        //ascending with compare method
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println("ascending with compare method");
        System.out.println(list);

        //descending with compare method
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println("descending with" +
                " compare method");
        System.out.println(list);

        List<Apple> inventory = Arrays.asList(
               Apple.builder().weight(500).color(Color.GREEN).build(),
                Apple.builder().weight(150).color(Color.RED).build(),
                Apple.builder().weight(200).color(Color.GREEN).build(),
                Apple.builder().weight(300).color(Color.ORANGE).build(),
                Apple.builder().weight(50).color(Color.RED).build()
        );

        Comparator<Apple> sortApple = Comparator.comparing((Apple apple)-> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);
    }
}
