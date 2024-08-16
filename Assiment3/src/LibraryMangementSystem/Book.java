package LibraryMangementSystem;

public class Book {
    private String title;
    private String subtitle;
    private static int totalbook;

    public Book(String title){
        this.title=title;
        totalbook++;
    }
    public Book(String title,String subtitle){
        this.title=title;
        this.subtitle=subtitle;
        totalbook++;
    }
    public static int getbook(){
        return totalbook;
    }

    public void display(){
        System.out.println("Title: "+this.title);
        if(this.subtitle!=null){
            System.out.println("Subtitle: "+this.subtitle);
        }
    }
}
