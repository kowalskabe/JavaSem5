package com.company;

import zad.Car;
import zad.Human;

public class Main {

    public static void main(String[] args) {
        Human kowalska = new Human();
        kowalska.car = new Car("Nissan", "Miscra", "cabriolet", "white");

        kowalska.car.displayDetails();
    }

}
