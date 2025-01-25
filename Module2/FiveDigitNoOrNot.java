package Module2;
import java.util.Scanner;

/**
 * 5DigitNoOrNot last four dig no < n and n< first 5 dig no 
 */
public class FiveDigitNoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (9999<n && n<100000) {
            System.out.println("This is a 5 digits number");
        }else{
            System.out.println("This is not a five digits number");
        }
        sc.close();
    }
}