package problems;

import java.util.Scanner;

public class studentPersentage {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in); //input object

        System.out.print("Enter the 1st Student marks: ");
        int a = so.nextInt(); //input a
        System.out.print("Enter the 2st Student marks: ");
        int b = so.nextInt();
        System.out.print("Enter the 3st Student marks: ");
        int c = so.nextInt();
        System.out.print("Enter the 4st Student marks: ");
        int d = so.nextInt();
        System.out.print("Enter the 5st Student marks: ");
        int e = so.nextInt();

        int total = a + b + c + d + e; //total marks
        double studentPersentage = ((double) total / 500) * 100; //persentage
        System.out.println("Student Persentage: "+studentPersentage);
    }
}
