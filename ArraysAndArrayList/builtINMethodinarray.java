package ArraysAndArrayList;

import java.util.Arrays;

public class builtINMethodinarray {
        public static void main(String[] args) {
            int arr []={5,22,44,11,7,88};
    
            for(int a : arr){
                System.out.print(a);
            }
            System.out.println();
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+", ");
            }
    }
}
