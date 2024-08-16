package LibraryMangementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Libaray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Book[] booklist = new Book[100];
    static String ques = "";

    public static void  display() throws IOException {
        System.out.print("Enter detail for new book title: ");
        String title = br.readLine();
        System.out.print("Subtitle(or press enter to skip): ");
        String subtitle = br.readLine();
        if(subtitle.isEmpty()){
            booklist[Book.getbook()]=new Book(title);
        }else{
            booklist[Book.getbook()]=new Book(title,subtitle);
        }
        System.out.print("Do you want to enter another book?(yes/no) :");
        ques= br.readLine();
        System.out.println(" ");
    }

    public static void main(String[] args) throws IOException {
        do{
            display();
        }while(ques.equalsIgnoreCase("yes"));
        System.out.println("Libaray Inventory :");
        for (int i = 0; i < Book.getbook(); i++) {
            booklist[i].display();
            if(i != Book.getbook()){
                System.out.println("The Total book: "+Book.getbook());
            }
            System.out.println("");
        }
    }
}
