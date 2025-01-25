package Array2D;

import java.util.Scanner;

class printMarksAndRollNo {
    public static void main(String[] args) {
        int arr[][]=new int [4][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

                System.out.println("Enter the Roll No");
                arr[i][0]=sc.nextInt();
                System.out.println("Enter the Marks");
                arr[i][1]=sc.nextInt();

        }

        for (int i = 0; i < 4; i++) {

            System.out.println("Roll No: " + arr[i][0] + ", Marks: " + arr[i][1]);

        }
    }
}