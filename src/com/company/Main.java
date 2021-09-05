package com.company;

import zad.Car;
import zad.Human;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Human kowalska = new Human();
        kowalska.car = new Car("Nissan", "Miscra", "cabriolet", "white");

        kowalska.getSalary();
        TimeUnit.SECONDS.sleep(1);
        kowalska.getSalary();
        TimeUnit.SECONDS.sleep(1);
        kowalska.setSalary(-4500.);
        TimeUnit.SECONDS.sleep(1);
        kowalska.getSalary();
        TimeUnit.SECONDS.sleep(1);
        kowalska.setSalary(6000.);
        TimeUnit.SECONDS.sleep(1);
        kowalska.getSalary();
    }

}
