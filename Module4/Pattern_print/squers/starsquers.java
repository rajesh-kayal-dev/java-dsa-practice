package Module4.Pattern_print.squers;

import java.util.Scanner;

public class starsquers {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();

        for (int i = 1; i <=n; i++) { //rows
            for (int j = 1; j <=n; j++) { //columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
