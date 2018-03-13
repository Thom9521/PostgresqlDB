import java.io.Serializable;

public class Employee implements Serializable {

    //  Employee ID
    private int ID;
    //  Employee name
    private String name;
    //  Employee salary
    private double salary;

    //  Employee constructor with ID, name, and salary
    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    //  ToString method
    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name=" + name +
                ", salary=" + salary +
                '}';
    }
}
