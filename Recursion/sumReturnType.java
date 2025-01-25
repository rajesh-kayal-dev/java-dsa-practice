package Recursion;

import java.util.Scanner;

public class sumReturnType {

    public static int sum(int n){
        if (n ==0 || n == 1) return n;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = so.nextInt();
        System.out.println("Sum is: "+sum(n));
    }
}
