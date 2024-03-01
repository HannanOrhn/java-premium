package tasks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Transaction {
    private Trader trader;
    private int year;
    private int value;
}
