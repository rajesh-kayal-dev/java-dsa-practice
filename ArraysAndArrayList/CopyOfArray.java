package ArraysAndArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int arr []={11,33,44,55,66,77};

        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
        // int nums []=arr; //shallow copy
        // nums [0]=90;
        // System.out.println(arr[0]); 

        int brr []= Arrays.copyOf(arr, arr.length); //deep copy
        brr[0]=80;
        System.out.println(arr[0]);

        int crr [] = new int[arr.length]; //deep copy

        for (int i = 0; i < crr.length; i++) {
            crr[i]=arr[i];
        }
        crr [0]=100;
        System.out.println(arr[0]);
    }
}
