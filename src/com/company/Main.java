package com.company;

import zad.Car;
import zad.Human;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Human kowalska = new Human();
        Car emilka = new Car("Nissan", "Miscra", "cabriolet", "white", 14000.);

        kowalska.setCar(emilka);
        kowalska.getSalary();
        kowalska.setSalary(15000.);
        kowalska.getSalary();
        kowalska.setCar(emilka);

        Car celina = new Car("Mercedes", "AMG CLA45", "shooting brake", "red", 400000.);
        kowalska.setCar(celina);
        kowalska.setSalary(35000.);
        kowalska.getSalary();
        kowalska.setCar(celina);
    }

}
