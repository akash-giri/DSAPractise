package com.code.Array;

import java.util.Scanner;

public class sprialMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int minrow=0,maxrow=row-1,mincol=0,maxcol=col-1,count=0,total=row*col;
        while(count<total) {
            //top row
            for(int irow=minrow,jcol=mincol;jcol<=maxcol&&count<total;jcol++) {
                System.out.println(array[irow][jcol]+ " row = "+ irow + " column"+ jcol);
                count++;
            }
            minrow++;
            //right column
            for(int irow=minrow,jcol=maxcol;irow<=maxrow&&count<total;irow++) {
                System.out.println(array[irow][jcol]+ " row = "+ irow + " column"+ jcol);
                count++;
            }
            maxcol--;
            //bottom row
            for(int irow=maxrow,jcol=maxcol;jcol>=mincol&&count<total;jcol--) {
                System.out.println(array[irow][jcol]+ " row = "+ irow + " column"+ jcol);
                count++;
            }
            maxrow--;
            //left column
            for(int irow=maxrow,jcol=mincol;irow>=minrow&&count<total;irow--) {
                System.out.println(array[irow][jcol]+ " row = "+ irow + " column"+ jcol);
                count++;
            }
            mincol++;
        }
    }
}
