package com.code.Matrix;


import java.util.ArrayList;

public class RotateMatrixByninety {

    public static void main(String[] args) {

//        int[][] array=new int[][]{{1,2},{3,4}};
//        for(int i=0;i<array.length;i++)
//        {
//            for(int j=0;j<array.length;j++)
//            {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list.add(list1);
        ArrayList<Integer>ls=new ArrayList<>();
        ls.add(3);
        ls.add(4);
        list.add(ls);
//        int j=0;
//        while(j<list.size()){
//            int i=list.size()-1;
//            while (i>=0)
//            {
//                System.out.print(list.get(i).get(j)+" ");
//                i--;
//            }
//            System.out.println();
//            j++;
        int i=0;
        while(i<list.size())
        {
            int j=i;
            while (j<list1.size())
            {
                int temp=list.get(i).get(j);
                list.set(list.get(i).get(j),new ArrayList<>(list.get(list.size()-1-j).get(i)));
                System.out.println(list.get(i).get(j));
                list.set(list.get(list.size()-1-j).get(i),new ArrayList<>(list.get(list.size()-1-i).get(list.size()-1-j)));
                list.set(list.get(list.size()-1-i).get(list.size()-1-j),new ArrayList<>(list.get(j).get(list.size()-1-i)));
                list.set(list.get(j).get(list.size()-1-i),new ArrayList<>(temp));
                j++;
            }
            i++;
        }
    }
}

/**
 for (int i = 0; i < N / 2; i++)
 {
 for (int j = i; j < N - i - 1; j++)
 {

 int temp = a[i][j];
 a[i][j] = a[N - 1 - j][i];
 a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
 a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
 a[j][N - 1 - i] = temp;
 }
 }
 */