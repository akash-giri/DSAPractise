package com.code.CollectionFramework.collectioninterface.List;

import java.util.ArrayList;
import java.util.List;

public class HackerRankProblem {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)>=38){
                int prod=grades.get(i)/5;
                int result=(prod+1)*5;
                int sub=result- grades.get(i);
                if(sub<3){
                    grades.set(i,result);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);
        gradingStudents(list);
        System.out.println(list);
    }
}
