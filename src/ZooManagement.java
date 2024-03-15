import java.util.Objects;
import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        Animal Crocodile = new Animal();
        Crocodile.name = "Larry";
        Crocodile.age = 5;
        Crocodile.family = "Crocodile-Carnivores";
        Crocodile.isMammal = false;

        Animal Monkey = new Animal();
        Monkey.name = "Monkeys-Steve";
        Monkey.age = 8;
        Monkey.family = "Herbivore";
        Monkey.isMammal = true;

        Zoo Zoo1=new Zoo();
        Zoo1.name="WildePark";
        Zoo1.nbranimals=2;
        Zoo1.city="Sousse";

        Animal Lion=new Animal(3,"Lions-Carnivores","scar Face",true);
        Animal Lion1=new Animal(3,"Lions-Carnivores","scar Face",true);
        Animal Tiger=new Animal(1,"Tigers-Carnivores","Megatron",true);
        Animal Giraffe=new Animal(5,"Giraffes-herbivores","Stacy",true);

        Zoo myZoo=new Zoo("Tunis","CloserToAnimals");
        myZoo.displayZoo();
        System.out.println();
        System.out.println(myZoo.toString());
        System.out.println();
        System.out.println(myZoo);
        System.out.println();
        Tiger.DisplayAnimal();
        System.out.println();
        System.out.println(Tiger.toString());
        System.out.println();
        System.out.println(Tiger);

        System.out.println(myZoo.addAnimal(Lion));
        System.out.println(myZoo.addAnimal(Tiger));
        System.out.println(myZoo.addAnimal(Giraffe));

        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal("scar Face"));
        Zoo zoo = Zoo.comparerZoo(Zoo1, myZoo);
        System.out.println(zoo);
    }
}
