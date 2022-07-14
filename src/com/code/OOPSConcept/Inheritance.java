package com.code.OOPSConcept;

public class Inheritance {
        public void act(){
            System.out.println("Act");
        }

    public static void main(String[] args) {
        Inheritance in=new Comedian();
        Inheritance in2=new Hero();
        in.act();
        in2.act();
    }



}
