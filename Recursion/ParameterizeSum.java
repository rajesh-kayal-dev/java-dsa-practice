package Recursion;

import java.util.Scanner;

public class ParameterizeSum {
    public static void sum(int n , int s){
        if (n ==0){
            System.out.println("Sum is: "+s);
            return;
        }
        sum(n-1, s+n);
    }
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = so.nextInt();
        sum(n,0);
    }
}
