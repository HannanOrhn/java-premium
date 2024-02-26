package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().age(20).firstName("Hannan").lastName("Orhan").build());
        users.add(User.builder().age(20).firstName("Ayse").lastName("Eroglu").build());
        users.add(User.builder().age(20).firstName("Mahmut").lastName("Emektar").build());
        users.add(User.builder().age(20).firstName("Dilvin").lastName("Uncuoglu").build());

        //print all elements in the list
        printUsers(users,p->true);

        //print all users that last name starts with E
        printUsers(users,p->p.getLastName().startsWith("E"));
    }
    private  static void printUsers(List<User> users, Predicate<User> predicate){
        for (User user : users){
            if (predicate.test(user)) {
                System.out.println(user.toString());
            }
        }
    }
}
