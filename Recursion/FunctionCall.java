package Recursion;

import java.util.Scanner;

public class FunctionCall {
    
    public static int fact(int n){
        if (n==1) return 1; // base case
        return  n * fact(n-1); //call
    }
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int  n = so.nextInt();
        System.out.println("Factrioal is: "+fact(n));
    }
}