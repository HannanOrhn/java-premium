package tasks;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {
        //Find all transactions in the year 2011 and sort them by value(small to high)
        TransactionData.readAll().stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("**************************");

        //Find unique cities where all traders work

        TransactionData.readAll().stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("**************************");

        //find all traders from Cambridge and sort them by name

        TransactionData.readAll().stream()
                .filter(c -> c.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("************************");
        //return a string of all traders names sorted
        String reduce = TransactionData.readAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce("", (p, t) -> p + " " + t);
        System.out.println("reduce = " + reduce);

        System.out.println("************************");
        //any traders based in milan

        Optional<Transaction> milan = TransactionData.readAll().stream()
                .filter(p -> p.getTrader().getCity().equalsIgnoreCase("milan"))
                .findAny();

        System.out.println("milan = " + milan);

        System.out.println("************** OR **********");
        boolean milan1 = TransactionData.readAll().stream()
                .anyMatch(p -> p.getTrader().getCity().equalsIgnoreCase("milan"));

        System.out.println("milan1 = " + milan1);


        System.out.println("************************");
        //all transactions from the traders living in Cambridge

        TransactionData.readAll().stream()
                .filter(p -> p.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(t -> t.getTrader().getName())
                .distinct()
                .forEach(System.out::println);


        System.out.println("************************");
        //highest value in transaction
        Optional<Integer> maxTrans = TransactionData.readAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println("maxTrans = " + maxTrans);

        System.out.println("************************");
        //highest value in transaction
        Optional<Integer> minTrans = TransactionData.readAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);

        System.out.println("minTrans = " + minTrans);

    }
}
