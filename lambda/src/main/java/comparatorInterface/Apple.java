package comparatorInterface;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Apple {
    private int weight;
    private Color color;
}
