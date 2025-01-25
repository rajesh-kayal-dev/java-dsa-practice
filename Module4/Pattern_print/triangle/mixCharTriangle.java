package Module4.Pattern_print.triangle;

import java.util.Scanner;
public class mixCharTriangle {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();

        for (int i = 1; i <=n; i++) { //rows
            for (int j = 1; j <=i; j++) { //columns
                if (i%2 ==0) {
                    System.out.print(j+" ");
                }else
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
