package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StateData {
    public static Stream<State> readAll() {
        return Stream.of(
                new State("Arizona", Arrays.asList("Phoenix", "Kingman")),
                new State("California", Arrays.asList("San Jose", "Santa Barbara", "San Diego")),
                new State("Colorado", Arrays.asList("Denver", "Boulder", "Gunnison")),
                new State("Florida", Arrays.asList("Miami", "Orlando", "Tampa"))
        );
    }
}
