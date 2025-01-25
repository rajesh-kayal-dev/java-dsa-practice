package Module2;

import java.util.Scanner;

public class GaterOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();

        int gratest;
        if (n1>=n2 && n1>=n3) {
            gratest= n1;
        }else if (n2>=n1 && n2>=n3) {
            gratest= n2;
        }else{
            gratest= n3;
        }

        int least;
        if (n1<=n2 && n1<=n3) {
            least= n1;
        }else if (n2<=n1 && n2<=n3) {
            least= n2;
        }else{
            least= n3;
        }

        System.out.println("Gratest number is:" + gratest);
        System.out.println("Least number is:" + least);
        sc.close();
    }
    
}
