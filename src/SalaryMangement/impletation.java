package SalaryMangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class impletation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Employee[] employees = new Employee[100];
    static String flag ="";


    public static void main(String[] args) throws IOException {
        display();
        for (int i = 0; i < Employee.employeeCount; i++) {
            employees[i].displayDetails();

        }
    }

    public static void display() throws IOException {
        do{
            System.out.print("Enter employee name: ");
            String name = br.readLine();
            System.out.print("Enter employee id: ");
            int id = Integer.parseInt(br.readLine());
            System.out.print("Enter employee Salary: ");
            double salary = Double.parseDouble(br.readLine());
            System.out.print("choose employee type: ");
            String type = br.readLine();
            if(type.equalsIgnoreCase("parttimeemployee")){
                System.out.print("Enter hour of work: ");
                int hour = Integer.parseInt(br.readLine());
                System.out.print("Enter hourly rate: ");
                double rate = Double.parseDouble(br.readLine());
                employees[Employee.employeeCount]= new PartTimeemployee(name,id,salary,hour,rate);
            }else if (type.equalsIgnoreCase("fulltimeemployee")){
                System.out.print("Enter employee allownace: ");
                double allw = Double.parseDouble(br.readLine());
                System.out.print("Enter employee bonus: ");
                double bonus = Double.parseDouble(br.readLine());
                employees[Employee.employeeCount]= new FullTimeEmployee(name,id,salary,allw,bonus);
            }else if(type.equalsIgnoreCase("contractemployee")){
                System.out.print("Enter employee contract Duration: ");
                int duration = Integer.parseInt(br.readLine());
                System.out.print("Enter employee contract Amount: ");
                double amount = Double.parseDouble(br.readLine());
                employees[Employee.employeeCount]= new ContractEmployee(name,id,salary,duration, amount);
            }
            System.out.print("Do you want to add another employee: ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
    }
}
