package Module1;
import java.util.Scanner;

public class inputSqure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Squre is: "+n*n);
        sc.close();
    }
}
