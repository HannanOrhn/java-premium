import lombok.Builder;
import lombok.Data;
import tasks.Type;

@Data
@Builder
public class Dish {
    private String name;
    private int calories;
    private boolean vegetarian;
    private Type type;
}
