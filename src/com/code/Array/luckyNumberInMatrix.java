package com.code.Array;

import java.util.ArrayList;
import java.util.List;

public class luckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix={{76618,42558,65788,20503,29400,54116}};
        List<Integer>ls=luckyNumbers(matrix);
        System.out.println(ls);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        int maximu = matrix[0][0];
        int mini = matrix[0][0];
        List<Integer> lst3 = new ArrayList<>();
        List<Integer> lst4 = new ArrayList<>();
        if (matrix[0].length < 2) {
            for (int i = 1; i < matrix.length; i++) {
                if (maximu < matrix[i][0]) {
                    maximu = matrix[i][0];
                }
            }
            lst3.add(maximu);
            return lst3;
        } else if (matrix.length < 2) {
            for (int i = 1; i < matrix[0].length; i++) {
                if (matrix[0][i]<mini) {
                    mini = matrix[0][i];
                }
            }
            lst4.add(mini);
            return lst4;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                int minimum = matrix[i][0];
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < minimum) {
                        minimum = matrix[i][j];
                    }
                }
                lst.add(minimum);
            }

            for (int j = 0; j < matrix[0].length; j++) {
                int maximum = matrix[0][j];
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][j] > maximum) {
                        maximum = matrix[i][j];
                    }
                }
                lst1.add(maximum);
            }

            for (int i = 0; i < lst.size(); i++) {
                for (int j = 0; j < lst1.size(); j++) {
                    if (lst.get(i) == lst1.get(j))
                        lst2.add(lst.get(i));
                }
            }

            return lst2;
        }
    }
}
