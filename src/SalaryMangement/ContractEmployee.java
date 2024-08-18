package SalaryMangement;

public class ContractEmployee extends Employee{
    private int contractDutration;
    private double contractAmount;

    public ContractEmployee(String name, int Id , double salary,int duration, double amount){
        super(name,Id,salary);
        this.contractDutration=duration;
        this.contractAmount=amount;
    }
    @Override
    public double calculateSalary() {
        double total = this.contractAmount / this.contractDutration;
        return total;
    }
    @Override
    public void displayDetails(){
        System.out.println("ContarctEmployee : ");
        System.out.println("ContractEmployee contractAmount: "+ this.contractAmount);
        System.out.println("ContractEmployee contractDuration :"+ this.contractDutration);
        System.out.println("ContractEmployee calculateSalary :"+ this.calculateSalary());
    }
}
