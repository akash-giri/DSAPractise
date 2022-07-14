package com.code.SearchingAndSorting.searching;

public class KoKoEatingBanana {

    public static void main(String[] args) {
       int[] piles = {3,6,7,11};
       int h = 8;
        System.out.println(minEatingSpeed(piles,h));

    }

    public static int minEatingSpeed(int[] piles, int h) {

        int speed = 1;
        while (true) {
            int hourSpent = 0;
            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / speed);
                if (hourSpent > h)
                    break;
            }
            if (hourSpent <= h)
                return speed;
            else
                speed += 1;
        }
    }
}
