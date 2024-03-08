import java.util.Arrays;
public class Zoo {
    int nbrcages;
    String city;
    String name;
    Animal[] animals;
    int nbranimals=0;

    public Zoo(){}

    public Zoo(int nbrcages,String city, String name) {
        this.city = city;
        this.name = name;
        this.nbrcages=nbrcages;
        animals = new Animal[nbrcages];
    }

   @Override
    public String toString() {
        return "Zoo{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", nbranimals=" + nbranimals +
                '}';
    }

    void displayZoo() {
        System.out.println("The name of the Zoo is : " + name);
        System.out.println("The city where this Zoo is located is : " + city);
        System.out.println("The number of animals in this Zoo is : " + nbranimals);
    }

    public boolean addAnimal(Animal animal) {
        int test=-1;
        for (int j=0;j<nbranimals;j++){
            if (animals[j].name.equals(animal.name)){
                test=1;
            }
        }
        if ((nbranimals < nbrcages)&&(test == -1)) {
            animals[nbranimals] = animal;
            nbranimals++;
            return true;
        }
        else {
            return false;
        }
    }
    void displayAnimals() {
        System.out.println("The List Of Animals Living in " + name + ":");
        for (int i = 0; i < nbranimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < nbranimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal.name);
        if (index==-1) {
            System.out.println("this animal doesn't exist in this Zoo");
            return false;
        }
            for (int i = index; i < nbranimals; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbranimals] = null;
            nbranimals--;
            System.out.println("The animal has been removed successfully");
            return true;
    }
}

