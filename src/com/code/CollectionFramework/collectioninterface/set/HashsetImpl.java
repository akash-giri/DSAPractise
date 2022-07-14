package com.code.CollectionFramework.collectioninterface.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetImpl {

    public static void main(String[] args) {
       // Set<Integer>set=new HashSet<>();//O(1)
      //  Set<Integer>set=new LinkedHashSet<>();

//        Set<Integer>set=new TreeSet<>(); //BST behind the scene with sorted order O(logn)
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//        System.out.println(set);
//        set.remove(54);
//        System.out.println(set);
//        System.out.println(set.contains(100));
        Set<Student>studentSet=new HashSet<>();
        studentSet.add(new Student("akash",1));
        studentSet.add(new Student("rohit",2));
        studentSet.add(new Student("ashu",3));

        studentSet.add(new Student("ranjan",2));
        System.out.println(studentSet);
    }
}
