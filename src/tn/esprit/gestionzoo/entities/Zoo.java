package tn.esprit.gestionzoo.entities;

public class Zoo {
    static final int NUMBER_OF_CAGES = 25;
    private String city;
    private String name;
    private Animal[] animals;
    private int nbranimals=0;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNbranimals() {
        return nbranimals;
    }

    public void setNbranimals(int nbranimals) {
        this.nbranimals = nbranimals;
    }

    public Zoo(){}

    public Zoo(String city, String name) {
        this.city = city;
        this.name = name;
        animals = new Animal[NUMBER_OF_CAGES];
    }

   @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", nbranimals=" + nbranimals +
                '}';
    }

    public void displayZoo() {
        System.out.println("The name of the tn.esprit.gestionzoo.entities.Zoo is : " + name);
        System.out.println("The city where this tn.esprit.gestionzoo.entities.Zoo is located is : " + city);
        System.out.println("The number of animals in this tn.esprit.gestionzoo.entities.Zoo is : " + nbranimals);
    }

    public boolean addAnimal(Animal animal) {
        int test=-1;
        for (int j=0;j<nbranimals;j++){
            if (animals[j].getName().equals(animal.getName())){
                test=1;
            }
        }
        if ((!isZooFull())&&(test == -1)) {
            animals[nbranimals] = animal;
            nbranimals++;
            return true;
        }
        else {
            return false;
        }
    }
    public void displayAnimals() {
        System.out.println("The List Of Animals Living in " + name + ":");
        for (int i = 0; i < nbranimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < nbranimals; i++) {
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal.getName());
        if (index==-1) {
            System.out.println("this animal doesn't exist in this tn.esprit.gestionzoo.entities.Zoo");
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
    public boolean isZooFull() {
        return nbranimals == NUMBER_OF_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbranimals > z2.nbranimals) ? z1 : z2;
    }
}

