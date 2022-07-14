package com.code.OOPSConcept;

public class intterfaces implements Cars{

    public static void main(String[] args) {

    }

    @Override
    public void starts() {
        System.out.println("My car is starting");
    }
}
interface Cars{
    void starts(); //by default any declaration is public abstract
}
