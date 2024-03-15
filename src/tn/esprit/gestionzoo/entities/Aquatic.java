package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(){
        super();
    }
    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public void swim() {
        System.out.println("This Aquatic animal is swimming.");
    }
}
