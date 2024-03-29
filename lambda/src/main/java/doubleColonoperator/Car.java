package doubleColonoperator;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String make;
    private  int model;

    public Car(){}
    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int model) {
        this.make = make;
        this.model = model;
    }
}
