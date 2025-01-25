package ArraysAndArrayList;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target Elelement: ");
        int x = sc.nextInt();
        System.out.print("Enter the sizew of array: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) flag=true;
            break;
        }

        if (flag==true) System.out.print("Element found!");
        if (flag==false) System.out.print("Element not found!");
          sc.close();
    }
}
