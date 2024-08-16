package SyudentMangementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainstudent {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentarray = new Student[100];
    static String ques = "";

    public static void display() throws IOException {
        System.out.println("Enter details for students :");
        System.out.print("Name: ");
        String name = br.readLine();
        System.out.print("Nikname: ");
        String nikname = br.readLine();
        int[] mark = new int[6];
        for (int i = 0; i <=5; i++) {
            System.out.print("Subject"+(i+1)+": ");
            mark[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter adress1: ");
        String add1 = br.readLine();
        System.out.print("Enter adress2: ");
        String add2 = br.readLine();
        if(add2.isEmpty()){
            studentarray[Student.getStudencount()]=new Student(name,nikname,add1,mark);
        }else{
            studentarray[Student.getStudencount()]=new Student(name,nikname,add1,add2,mark);
        }
        System.out.print("Do you wamt to enter another student/(yes/no): ");
        ques= br.readLine();
    }

    public static void main(String[] args) throws IOException {
        do{
            display();
        }while(ques.equalsIgnoreCase("yes"));
        for (int i = 0; i < Student.getStudencount(); i++) {
            studentarray[i].dsiplay();
            System.out.println();
            if(i==Student.getStudencount()-1){
                System.out.println("Mean Mark: ");
                studentarray[i].Calculated();
                System.out.println();
                System.out.println("Highest GPA student: ");
               Student.getHigheststudent().dsiplay();
            }
        }

    }
}
