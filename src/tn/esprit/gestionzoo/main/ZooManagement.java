package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Objects;
import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        Animal Crocodile = new Animal();
        Crocodile.setName("Larry");
        Crocodile.setAge(5);
        Crocodile.setFamily("Crocodile-Carnivores");
        Crocodile.setMammal(false);

        Animal Monkey = new Animal();
        Monkey.setName("Monkeys-Steve");
        Monkey.setAge(8);
        Monkey.setFamily("Herbivore");
        Monkey.setMammal(true);

        Zoo Zoo1=new Zoo();
        Zoo1.setName("WildePark");
        Zoo1.setNbranimals(2);
        Zoo1.setCity("Sousse");

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

        Dolphin dolphin = new Dolphin();
        dolphin.setSwimmingSpeed(12.5f);
        Penguin penguin = new Penguin();
        penguin.setSwimmingDepth(10.6f);
        Terrestrial Hyenas = new Terrestrial();
        Hyenas.setNbrLegs(4);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(Hyenas);
        dolphin.swim();
        penguin.swim();
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(dolphin);

    }
}
