import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //Print all emails
        System.out.println("***** Print all emails *****");
        //one employee has one email -> one-to-one -> map
        EmployeeData.readAll()
                .map(Employee::getEmployeeEmail)
                .forEach(System.out::println);

        System.out.println("***** Print all phone numbers *****");
        EmployeeData.readAll()
                .map(Employee::getEmployeePhone)
                .forEach(System.out::println);

        System.out.println("******flatmap first way*********");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmployeePhone().stream())
                .forEach(System.out::println);

        System.out.println("******flatmap second way*********");
        EmployeeData.readAll()
                .map(Employee::getEmployeePhone)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
