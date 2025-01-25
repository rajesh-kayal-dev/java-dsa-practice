package Module1;
import java.util.Scanner;

public class inputASCI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCI value is: "+ (int)ch);
        sc.close();
    }
}
