package Module4.Pattern_print.specialpatterns;

import java.util.Scanner;
/**
 * floyedTriangle
 */
public class floyedTriangle {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
    int a=1;
        for (int i = 1; i <=n; i++) { //rows
            for (int j = 1; j <=i; j++) { //columns
                System.out.print((char)(64+a++) +" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}