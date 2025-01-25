package basicSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class buildinSort {
    public static void main(String[] args) {
        int arr[]={1,6,3,4,5,2};
        for (int ele : arr){
            System.out.println(ele);
        }
        System.out.println();
        Arrays.sort(arr);

        for (int ele : arr){
            System.out.println(ele);
        }
    }
}
