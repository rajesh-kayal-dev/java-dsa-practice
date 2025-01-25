package Module2;

import java.util.Scanner;

//Given a point (x,y) write a program to find out if it lies in the 1st quadrant,2nd quadrant,
//3rd quadrant,4th quadrant,on the x=axis,y-axis or at the origin , viz.(0,0)
public class PointPosistion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        double x= sc.nextDouble();

        System.out.print("Enter the x-coordinater: ");
        double y = sc.nextDouble();

        if (x ==0 && y ==0) {
            System.out.println("The point is at the origin(0,0). ");
        }else if (x ==0 ) {
            System.out.println("The point is at the y-axis");
        }else if (y ==0 ) {
            System.out.println("The point is at the x-axis");
        }else if (x > 0 && y > 0) {
            System.out.println("The point is at the first quadrant.");
        }else if (x < 0 && y > 0) {
            System.out.println("The point is at the second quadrant.");
        }else if (x < 0 && y < 0) {
            System.out.println("The point is at the third quadrant.");
        }else{
            System.out.println("The point is at the fourth quadrant.");
        }

        sc.close();
    }
}
