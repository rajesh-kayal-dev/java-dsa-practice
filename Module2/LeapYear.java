package Module2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        if ((year%4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year+" is leap year");
        }else{
            System.out.println("It is not leap year");
        }
        sc.close();
    }
}
