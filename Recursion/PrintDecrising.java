package Recursion;

import java.util.Scanner;

public class PrintDecrising {

    public static void print(int n ){
        if ( n == 0) return;
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = so.nextInt();
        print(n);
    }
    
}