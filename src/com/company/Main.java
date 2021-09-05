package com.company;

import zad.Animal;
import zad.Human;

public class Main {

    public static void main(String[] args) {
        Human kowalska = new Human();
        kowalska.pet = new Animal("dog");
        kowalska.pet.feed();
        kowalska.pet.takeForAWalk();
        kowalska.pet.takeForAWalk();
        kowalska.pet.takeForAWalk();
        kowalska.pet.takeForAWalk();
        kowalska.pet.takeForAWalk();
        kowalska.pet.takeForAWalk();
        kowalska.pet.takeForAWalk();
        kowalska.pet.feed();

    }
}
