package ArraysAndArrayList;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        int sum =0;
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}
