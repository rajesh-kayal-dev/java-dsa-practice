package Module2;

import java.util.Scanner;

public class ValifdTryangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side: ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd side: ");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd side: ");
        int c = sc.nextInt();

        System.out.println(((a+b)>c && (b+c)>a && (c+a)>b)? "Valid Tryangle":"Invalid Tryangle");
        sc.close();
    }
}
