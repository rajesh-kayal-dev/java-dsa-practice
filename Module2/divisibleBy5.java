package Module2;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input: ");
        int n = sc.nextInt();
        if (n%5==0) {
            System.out.println("yes it is divisible by 5");
        } else {
            System.out.println("No it is not ");
        }
        sc.close();
    }
}
