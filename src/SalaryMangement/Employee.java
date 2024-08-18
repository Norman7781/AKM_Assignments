package SalaryMangement;

abstract public class Employee {
    private String name;
    private int employeeId;
    private double basicSalary;
    static int employeeCount =0;

    public Employee(String name, int id,double salary){
        this.name = name;
        this.employeeId=id;
        this.basicSalary = salary;
        employeeCount++;
    }
    public double getBasicSalary(){
        return this.basicSalary;
    }
    public double calculateSalary(){
        return 0.0;
    }
    abstract public void displayDetails();
}
