package zad;


import java.io.Console;

public class Animal {
    final String species;
    private Double weight;


    public Animal(String species) {
        this.species = species;
        this.weight = setWeight(species);
    }

    private Double setWeight(String currSpecies){
        return switch (currSpecies.toUpperCase()) {
            case "CAT" -> 3.5;
            case "DOG" -> 5.0;
            case "RABBIT" -> 1.5;
            default -> 0.;
        };

    }

    public void feed(){
        if (this.weight > 0.){
            this.weight += 1.;
            System.out.println("Omnomnom..");
        }
        else {
            System.out.println("You can't feed the dead animal. It's sickening!");
        }
    }

    public void takeForAWalk(){
        if (this.weight > 0.){
            this.weight -= 1.;
            System.out.print("Yey! Walk <3.");
            if (this.weight > 0.){
                System.out.println("\r");
            }
            else {
                System.out.println(" Pity that the last one - you just kill your pet..");
            }
        }
        else {
            System.out.println("You can't' take the dead animal for a walk. It's sick!");
        }
    }

}
