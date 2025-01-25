package Module2;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int l = sc.nextInt();

        System.out.print("Enter the width :");
        int w = sc.nextInt();

        int area = l * w;
        int parameter = 2*(l+w);

        if (area > parameter) {
            System.out.println("the area of rectangle is gater then its parameter. ");
        }else if (parameter > area) {
            System.out.println("The parameter of rectangle is gater then its area");
        }else{
            System.out.println("the area and parameter of rectangle are equal ");
        }
        sc.close();
    }
}
