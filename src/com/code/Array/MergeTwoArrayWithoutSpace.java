package com.code.Array;

public class MergeTwoArrayWithoutSpace {

    /**
     * time complexity O(n*m) and space (1)
     * Algorithm
     * Now traverse the array1 and if arr2 first element is less than arr1 then swap
     *  after swapping we have to sort the array2 again so that it can be again swap with arr1
     *  we will store the firstElement of array2 and left shift all the element and store
     *  the firstElement in arr2[k-1]
     * @param arr1
     * @param arr2
     */
    public static void mergeArray(int[] arr1, int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {

            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int firstElement = arr2[0];
                int k;
                for (k = 1; k < m && arr2[k] < firstElement; k++)
                {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = firstElement;
            }
        }

        // read the arr1
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();

        // read the arr2
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    // Driver Code
//    public static void main(String[] args)
//    {
//        int[] arr1 = { 1, 3, 5, 7 };
//
//        int[] arr2 = { 0, 2, 6, 8, 9 };
//        mergeArray(arr1, arr2);
//    }

    /********************************************************************************************/

    /**
     * time complexity O(n+m)  and space complexity (1)
     * Algorithm
     * Find maximum element of both array
     * Increment one two avoid collision of 0 and maximum element of array in modulo operation
     * Recover back original element to compare
     * Update element by adding multiplication with new number
     * Process those elements which are left in array a.
     * Process those elements which are left in array b.
     * Finally update elements by dividing with maximum element a and b.
     * @param a
     * @param b
     * @param n
     * @param m
     */
    static void mergeArray(int a[], int b[],int n, int m)
    {
        int mx = 0;
        for(int i = 0; i < n; i++)
        {
            mx = Math.max(mx, a[i]);
        }

        for(int i = 0; i < m; i++)
        {
            mx = Math.max(mx, b[i]);
        }
        mx++;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m && k < (n + m))
        {
            int e1 = a[i] % mx;
            int e2 = b[j] % mx;
            if (e1 <= e2)
            {
                // Update element by adding multiplication with new number
                if (k < n)
                    a[k] += (e1 * mx);
                else
                    b[k - n] += (e1 * mx);
                i++;
                k++;
            }
            else
            {
                // Update element by adding multiplication with new number
                if (k < n)
                    a[k] += (e2 * mx);
                else
                    b[k - n] += (e2 * mx);
                j++;
                k++;
            }
        }
        // Process those elements which are
        // left in array a
        while (i < n)
        {
            int el = a[i] % mx;
            if (k < n)
                a[k] += (el * mx);
            else
                b[k - n] += (el * mx);

            i++;
            k++;
        }

        // Process those elements which are
        // left in array a
        while (j < m)
        {
            int el = b[j] % mx;

            if (k < n)
                b[k] += (el * mx);
            else
                b[k - n] += (el * mx);

            j++;
            k++;
        }

        // Finally update elements by dividing
        // with maximum element
        for(int in = 0; in < n; in++)
            a[in] = a[in] / mx;

        // Finally update elements by dividing
        // with maximum element
        for(int in = 0; in < m; in++)
            b[in] = b[in] / mx;

        return;
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { 3, 5, 6, 8, 12 };
        int b[] = { 1, 4, 9, 13 };

        // Length of a
        int n = a.length;

        // length of b
        int m = b.length;

        // Function Call
        mergeArray(a, b, n, m);

        System.out.print("First array : ");
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        System.out.print("Second array : ");
        for(int i = 0; i < m; i++)
            System.out.print(b[i] + " ");

        System.out.println();
    }




}
