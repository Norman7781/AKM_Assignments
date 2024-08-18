package SalaryMangement;

public class PartTimeemployee extends Employee{
    private int hourWorked;
    private double hourlyRate;
    public PartTimeemployee(String name, int Id , double salary, int hour, double rate){
        super(name,Id,salary);
        this.hourWorked= hour;
        this.hourlyRate=rate;
    }

    @Override
    public double calculateSalary() {
        double total = this.hourWorked * this.hourlyRate;
        return total;
    }
    @Override
    public void displayDetails(){
        System.out.println("PartTimeEmployee : ");
        System.out.println("PartTimeEmployee hourWorked: "+ this.hourWorked);
        System.out.println("PartTimeEmployee hourlyRate :"+ this.hourlyRate);
        System.out.println("PartTimeEmployee calculateSalary :"+ this.calculateSalary());
    }
}
