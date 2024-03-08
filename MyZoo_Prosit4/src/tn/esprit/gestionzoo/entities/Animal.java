package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family,name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(int age , String family, String name, boolean isMammal){
        this.age=age;
        this.family=family;
        this.name=name;
        this.isMammal=isMammal;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void DisplayAnimal(){
        System.out.println("The tn.esprit.gestionzoo.entities.Animal's Name is : " +name);
        System.out.println("The tn.esprit.gestionzoo.entities.Animal's Age is : " +age);
        System.out.println("The tn.esprit.gestionzoo.entities.Animal's Family is : " +family);
        System.out.println("Is The tn.esprit.gestionzoo.entities.Animal one of the Mammal ? : " +isMammal);
    }
}
