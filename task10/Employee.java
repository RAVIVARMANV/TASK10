package task10;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(int percent) {
        double raisesalary = 1 + (percent / 100.0);
        salary = (int) (salary * raisesalary);
    }

    
    public String toString() {
        return "Employee [id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }    
}

