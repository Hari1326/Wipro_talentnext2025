import java.util.Optional;
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
    }
}

public class oop23 {
public static void main(String[] args) {
        Employee emp = null;
        try {
           
            Employee validEmp = Optional.ofNullable(emp)
                .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee: Employee object is null"));
            validEmp.display();
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}



