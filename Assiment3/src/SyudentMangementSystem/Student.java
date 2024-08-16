package SyudentMangementSystem;

import java.util.Arrays;

public class Student {
    private String name;
    private String nikname;
    private String Adress1;
    private String Adress2;
    private int mark[];
    private static int studencount;
    private static double highestgpa =0 ;
    private static Student higheststudent;
    private static int[] calculation = new int[6];

    public Student(String name,String nikname,String Adress1,int[] mark){
        this.name = name;
        this.nikname = nikname;
        this.Adress1 = Adress1;
        this.mark = mark;
        studencount++;
    }
    public Student(String name,String nikname,String Adress1,String Adress2,int[] mark){
        this.name = name;
        this.nikname = nikname;
        this.Adress1 = Adress1;
        this.Adress2 = Adress2;
        this.mark=mark;
        studencount++;
    }
    public int totalmark(){
        int total =0;
        for (int i = 0; i < this.mark.length; i++) {
            total +=this.mark[i];
        }
        return total;
    }
    public double CountGPA(){
        Double gpa = (double) totalmark() /this.mark.length;
        if(highestgpa<gpa){
            highestgpa = gpa;
            higheststudent= this;
        }
        return gpa;
    }
    private void updateCumulativeMarks() {
        for (int i = 0; i < mark.length; i++) {
            calculation[i] += mark[i];
        }
    }
    public void Calculated() {
        for (int i = 0; i < calculation.length; i++) {
           calculation[i] = calculation[i] / getStudencount();
            System.out.println(calculation[i]);
        }

    }
    public void dsiplay(){
        updateCumulativeMarks();
        System.out.println("Name: "+ this.name+" ("+nikname+")");
        System.out.println("Mark: "+ Arrays.toString(this.mark));
        System.out.println("GPA: "+CountGPA());
        System.out.println("Adress1: "+ this.Adress1);
        if(this.Adress2 != null){
            System.out.println("Adress2: " + this.Adress2);
        }else{
            System.out.println("Adress2: Not provided");
        }
    }
    public static int getStudencount(){
        return studencount;
    }

    public static Student getHigheststudent() {
        return Student.higheststudent;
    }
}