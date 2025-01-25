package Module3;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int n = sc.nextInt();
        int sum =0;
        while (n != 0) {
            int LastDigit=n%10;
            sum += LastDigit; //we can also use sum +=n%10
            n /= 10;
        }
        System.out.println("Sum of digits is: "+sum);
        sc.close();
    }
}
