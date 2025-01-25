package ArraysAndArrayList;
import java.util.Scanner;

public class arrInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Array length is: "+arr.length);
        //input array
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //output array
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}