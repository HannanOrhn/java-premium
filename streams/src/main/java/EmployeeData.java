import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(1,"hannan","abc@gmail.com", Arrays.asList("123456","123450")),
                new Employee(2,"belkis","bcd@gmail.com", Arrays.asList("123451","123452")),
                new Employee(1,"nur","cde@gmail.com", Arrays.asList("123453","123454"))
        );
    }
}
