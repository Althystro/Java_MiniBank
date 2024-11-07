package Bonus;

public class JuniorEngineer extends EmployeeAtr implements Employee {

    public JuniorEngineer(String name, String employeeId, String position, double basicSalary) {
        super(name, employeeId, position, basicSalary);
    }

    @Override
    public void printName() {
        System.out.println("Name: " + getName());
    }

    @Override
    public void printEmployeeId() {
        System.out.println("Employee ID: " + getEmployeeId());
    }

    @Override
    public void printPosition() {
        System.out.println("Position: " + getPosition());
    }

    @Override
    public void printBasicSalary() {
        System.out.println("Basic Salary: " + getBasicSalary());
    }
}
