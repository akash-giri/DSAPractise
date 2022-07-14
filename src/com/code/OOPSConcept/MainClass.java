package com.code.OOPSConcept;

import com.code.OOPSConcept.Encasulation.EncapsulationIntro;

public class MainClass {
    public static void main(String[] args) {
       // System.out.println("hello world");
//        Person p1=new Person();
//        p1.age=24;
//        p1.name="Akash";
//        Person p2=new Person(31,"giri");
//        System.out.println(p1.age +" "+p1.name);
//        System.out.println(p2.age+" "+ p2.name);
//        p1.eat();
//        p2.walk(2);
       // System.out.println(Person.count);
//        Developer d1=new Developer(24,"alia");
//        d1.walk();
        EncapsulationIntro e1=new EncapsulationIntro();
        e1.doWork();
    }
}
class Developer extends Person{

    public Developer(int age, String name) {
        super(age, name);
    }
    void walk(){
        System.out.println(name+" is dev walking");
    }

}
class Person{
    protected String name;
    int age;

    static int count;
    public Person(){
        count++;
        System.out.println("creating an object");
    }

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int steps){
        System.out.println(name+" walked "+steps);
    }
}
