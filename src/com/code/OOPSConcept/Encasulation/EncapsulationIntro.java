package com.code.OOPSConcept.Encasulation;

public class EncapsulationIntro {

    /**
     * a variables and methods are kept together to do one work
     * @param args
     */
    public static void main(String[] args) {
        Laptop l1=new Laptop();
       // l1.price=23;
        l1.setPrice(31);

    }
    public void doWork(){
        System.out.println("working working");
    }

}
class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        //is the user an admin
        boolean isAdmin=false;
        if(!isAdmin){
            System.out.println("invalid not an admin");
        }
        else {
            this.price=price;
        }
        this.price=price;
    }
}