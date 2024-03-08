public class Animal {
    String family,name;
    int age;
    boolean isMammal;

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
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    void DisplayAnimal(){
        System.out.println("The Animal's Name is : " +name);
        System.out.println("The Animal's Age is : " +age);
        System.out.println("The Animal's Family is : " +family);
        System.out.println("Is The Animal one of the Mammal ? : " +isMammal);
    }
}
