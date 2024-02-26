package lambdaTask1;
import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> oranges = new ArrayList<>();
        oranges.add(Orange.builder().weight(20).color(Color.GREEN).build());
        oranges.add(Orange.builder().weight(50).color(Color.PINK).build());
        oranges.add(Orange.builder().weight(150).color(Color.RED).build());
        oranges.add(Orange.builder().weight(250).color(Color.PINK).build());
        oranges.add(Orange.builder().weight(500).color(Color.RED).build());
        oranges.add(Orange.builder().weight(200).color(Color.PURPLE).build());
        oranges.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter orangeFormatter = (Orange orange) -> "An orange of " + orange.getWeight() + "g";
        printOrange(oranges,orangeFormatter);

        System.out.println("*******************************");

        OrangeFormatter purpleOranges = orange -> {
                return orange.getColor().equals(Color.PURPLE)? "An orange with " + orange.getColor() + " color and " + orange.getWeight() +"g" : "This orange is not a purple color";
        };
        printOrange(oranges,purpleOranges);

        System.out.println("*******************************");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };
        printOrange(oranges,fancyFormatter);

    }

    private static void printOrange(List<Orange> oranges, OrangeFormatter orangeFormatter){
        for(Orange orange : oranges){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
