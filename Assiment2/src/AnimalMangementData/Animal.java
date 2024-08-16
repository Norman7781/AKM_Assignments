package AnimalMangementData;
public class Animal {
    private String name;
    private int age;
    private String species;
    private int count =0;
    public  static int AnimalCount = 0;

    public Animal(String name,int age,String specie){
        this.name=name;
        this.age=age;
        this.species=specie;
        AnimalCount++;
    }
    public void outputData(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Species:"+species+"\n");
    }
}
