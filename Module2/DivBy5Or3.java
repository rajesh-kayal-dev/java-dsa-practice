package Module2;
import java.util.Scanner;

public class DivBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 5 == 0 || n % 3 == 0 ) {
            System.out.println("The number is Divisable by 5 or 3");
        }else{
            System.out.println("The number not Divisable by 5 or 3");
        }
        sc.close();
    }
}
