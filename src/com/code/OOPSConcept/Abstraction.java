package com.code.OOPSConcept;

public class Abstraction {

    public static void main(String[] args) {
       Audi a1=new Audi();
       a1.start();
    }
}
class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi is start");
    }
}
class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is start");
    }
}
abstract class Car{
    int price;

    abstract void start();
}
