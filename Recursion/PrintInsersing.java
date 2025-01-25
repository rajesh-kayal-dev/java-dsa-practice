package Recursion;

import java.util.Scanner;

public class PrintInsersing {

    public static void print(int x,int n) {
        if (x>n) return;
        System.out.println(x);
        print(x+1,n);
    }
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = so.nextInt();

        print(1,n);
    }
}