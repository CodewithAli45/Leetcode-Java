package UptoTen;

import java.util.Arrays;

public class MedianofArray {
    public static int [] mergeArray(int A[], int []B){
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while(i < A.length && j < B.length){
            if(A[i] < B[j]){
                C[k] = A[i];
                i++;
                k++;
            } else {
                C[k] = B[j];
                j++;
                k++;
            }
        }
        while(i < A.length){
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length){
            C[k] = B[j];
            j++;
            k++;
        }

        return C;
    }

    public static double findMedian(int arr1[], int arr2[]){
        int merge [] = new int[arr1.length + arr2.length];
        merge = mergeArray(arr1, arr2);
        Arrays.sort(merge);
        display(merge);
        double median = 0;

        int middle = merge.length / 2;
        System.out.println("middle is " + middle);
        if(merge.length % 2 != 0){
            // odd
            return median = merge[middle];
        } else {
            // even
            median = (merge[middle - 1] + merge[middle]) / 2.0;
        }

        return median;
    }

    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {1,3};
        int B[] = {2,4};
        int res[] = mergeArray(A, B);
        display(res);
        double ans = findMedian(A, B);
        System.out.println(ans);
    }
}
