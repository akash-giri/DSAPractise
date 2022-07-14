package com.code.Array;

import java.util.Scanner;

public class ReverseAnArray {

    /**
     * Input  : arr[] = {1, 2, 3}
     * Output : arr[] = {3, 2, 1}
     */
     public int[] reverseArray(int size,int[] arr){
         for(int i=0;i<(size/2);i++){
            int temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
         }
         return arr;
     }

     /*
       1000
       3
       1 500
       2 1400
       2 500
       --------
       output
       1500
       100
       Insufficient Funds
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long balance_In_Account = sc.nextLong();
        int no_Of_Operations=sc.nextInt();
        while(no_Of_Operations>0)
        {
            int type=sc.nextInt();
            long amount=sc.nextLong();
            if(type==1)
            {
                balance_In_Account=  (balance_In_Account+amount);
                System.out.println(balance_In_Account);
            }
            if(type==2){
                if(balance_In_Account>amount){
                    balance_In_Account= (balance_In_Account-amount);
                    System.out.println(balance_In_Account);
                }
                else {
                    System.out.println("Insufficient Funds");
                }

            }
            no_Of_Operations--;
        }
    }
}

//99986711
//        10100001946
//        10100004852
//        10099988699
//        10100007766
//        10099983721
//        10100009284
//        10100034673
//        10100007263
//        10099979619
//        10200009922
//        10100009289
//        10200026578
//        200025624
//        199997802
//        99985537
//        199995298
//        199989826
//        299996835
//        400011841
//        10400042294
//        20400067407
//        20500078000
//        20600078817
//        20700105880
//        10700098107
//        10700110543
//        10700118184
//        10800143714
//        10700131992
//        10800140469
//        10800147172
//        10800140616
//        10900160437
//        10900147521
//        11000159554
//        10900140045
//        10800130158
//        10800137344
//        10800145246
//        800136421
//        700133478
//        Insufficient Funds
//        800140927
//        800129258
//        900134588
//        800116683
//        900147896
//        900163874
//        10900163906
//        10900181647
//        10900200757
//        20900209497
//        20900193385
//        20900171138
//        20900161355
//        20800159350
//        20800149456
//        20900172518
//        20900198028
//        20900209329
//        20900187802
//        20800161853
//        20800177926
//        20800199662
//        20800201457
//        20900209679
//        20900190992
//        21000204819
//        21000186791
//        21000168183
//        21100175944
//        21100172763
//        21000170545
//        21100191396
//        21100194577
//        21200225368
//        31200233121
//        31200243667
//        31200230108
//        31200232793
//        31300242579
//        31300236101
//        31300262384
//        31200252520
//        3120026