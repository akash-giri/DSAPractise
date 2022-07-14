package com.code.CollectionFramework.anotherTopic;

import com.code.CollectionFramework.collectioninterface.set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClasses {

    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student("akas",1));
        list.add(new Student("ramesh",4));
        list.add(new Student("shivam",3));
        list.add(new Student("rohit",2));

        Student s1=new Student("Akash",2);
        Student s2=new Student("rohit",3);
      //  System.out.println((s1.compareTo(s2)));
        System.out.println(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
//        List<Integer> list=new ArrayList<>();
//        list.add(36);
//        list.add(12);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(76);
//
//        System.out.println("min element "+ Collections.min(list));
//        System.out.println("max element "+Collections.max(list));
//        System.out.println("count element"+Collections.frequency(list,76));
//
//         Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
    }
}
