package AnimalMangementData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Animaldive {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Animal[] animalarry = new Animal[100];

    static String ques ="";

    public static void main(String[] args) throws IOException {
        do{
            display();
        }while(ques.equalsIgnoreCase("yes"));
        for (int i = 0; i < Animal.AnimalCount; i++) {
            System.out.println("Animal "+(i+1)+":");
            animalarry[i].outputData();
        }

    }
    public static void display() throws IOException {
        System.out.print("Enter animal name: ");
        String name = br.readLine();
        System.out.print("Enter animal age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter animal Species: ");
        String species = br.readLine();
        animalarry[Animal.AnimalCount]= new Animal(name,age,species);
        System.out.print("Do you want to enter another animal(yes/no): ");
        ques = br.readLine();
    }
}
