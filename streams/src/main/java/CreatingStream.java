import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating stream from Array
        String[] girls = {"Hano","Beko","Yuri","Ezo"};
        //Create a stream source and make it ready for the process
        Stream<String> girlsStream = Arrays.stream(girls);

        //Creating stream from Array
        List<String> countries = Arrays.asList("Germany","Canada","Turkey","Ukraine");
        Stream<String> contryStream = countries.stream();

        List<Girl> myGirls = Arrays.asList(
                new Girl(28,"Hannan"),
                new Girl(34,"Belkis"),
                new Girl(35,"Nur"),
                new Girl(31,"Ezgi"));

        Stream<Girl> myGirlsStream = myGirls.stream();


        //Creating Stream from values
        Stream<Integer> streamValues = Stream.of(1,2,3,4);

    }
}
