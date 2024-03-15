package tn.esprit.gestionzoo.entities;

public class Zoo {
    static final int NUMBER_OF_CAGES = 25;
    private String city;
    private String name;
    private Animal[] animals;
    private int nbranimals=0;
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals=0;

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

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
        aquaticAnimals = new Aquatic[10];
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
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < 10) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("La liste des animaux aquatiques est pleine, impossible d'ajouter plus d'animaux.");
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

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int nbrOfPenguins = 0;
        int nbrOfDolphins = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrOfDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrOfPenguins++;
            }
        }
        System.out.println("This Zoo has : \n" + nbrOfDolphins + " Dolphins \n" + nbrOfPenguins + " Penguins");
    }
}

