package Module1;
import java.util.Scanner;

/**
 * AreaOfCircle = A= π r^2
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
       double A = 3.141592 *r*r;

       System.out.println("Area of circle is redius "+r+" is: "+A);
       sc.close();
    }
}