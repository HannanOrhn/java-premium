package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TransactionData {
    public static List<Transaction> readAll(){
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2015,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(raoul,2011,700),
                new Transaction(raoul,2011,800),
                new Transaction(raoul,2011,1000),
                new Transaction(mario,2014,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2013,950)
        );
        return transactions;
    }
}
