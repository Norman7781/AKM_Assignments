package SalaryMangement;

public class FullTimeEmployee extends Employee{
    private double allowance;
    private double bonus;

    public FullTimeEmployee(String name, int Id , double salary, double allw, double bonus){
        super(name,Id,salary);
        this.allowance=allw;
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        double total = this.getBasicSalary()+this.allowance+this.bonus;
        return total;
    }
    @Override
    public void displayDetails(){
        System.out.println("FullTimeEmployee : ");
        System.out.println("FullTimeEmployee allowance: "+ this.allowance);
        System.out.println("FullTimeEmployee bonus :"+ this.bonus);
        System.out.println("FullTimeEmployee calculateSalary :"+ this.calculateSalary());
    }

}
