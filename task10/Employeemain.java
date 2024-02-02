package task10;

public class Employeemain {

	public static void main(String[] args) {
		
        Employee employee = new Employee(1, "Ravi", "Varman", 33000);
        System.out.println("Original Employee: " + employee);
        employee.raiseSalary(10); 
        System.out.println("After Raise: " + employee);
	}
}