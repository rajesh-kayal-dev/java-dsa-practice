package Module4.Pattern_print.specialpatterns;

import java.util.Scanner;

public class OddTringle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();

        for (int i = 1; i <=n; i++) { //rows
            for (int j = 1; j <=i; j++) { //columns
                System.out.print(2*j-1+" ");// 2*2=4 -1= 3
            }
            System.out.println();
        }
        sc.close();
    }
}
