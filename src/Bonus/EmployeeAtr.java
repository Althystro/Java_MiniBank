package Bonus;

public abstract class EmployeeAtr {
    private final String name;
    private final String employeeId;
    private final String position;
    private final double basicSalary;

    public EmployeeAtr(String name, String employeeId, String position, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Employee Id: " + employeeId + ", Position: " + position + ", Basic Salary: " + basicSalary;
    }
}
