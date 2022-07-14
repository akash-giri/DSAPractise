package com.code.Array;

public class FlippingImage {

    /**
     * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
     * Output: [[1,0,0],[0,1,0],[1,1,1]]
     * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     * @param args
     */
    public static void main(String[] args) {
       int[][] array=new int[][]{
               {1,1,0},
               {1,0,1},
               {0,0,0}
       };
       int row=0,col=0;
        for(int i=row;i<array.length;i++)
        {
                int j=0;
                int k=array.length-1;
                while(j<k)
                {
                    int temp=array[i][j];
                    array[i][j]=array[i][k];
                    array[i][k]=temp;
                    k--;
                    j++;
                }
        }
        for(int i=row;i<array.length;i++) {
            for (int j = col; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        for(int i=row;i<array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                if(array[i][j]==0)
                {
                    array[i][j]=1;
                }
                else{
                    array[i][j]=0;
                }
            }
        }
        System.out.println("After flipping the image");
        for(int i=row;i<array.length;i++) {
            for (int j = col; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

       // s.trim("*");

    }
}
