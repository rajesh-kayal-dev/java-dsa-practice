package Module2;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Ram age: ");
        int ram = sc.nextInt();

        System.out.print("Enter the shyam age: ");
        int shyam = sc.nextInt();

        System.out.print("Enter the ajay age: ");
        int ajay = sc.nextInt();

        if (ram < shyam) {
            if(ram < ajay){
                System.out.println("Ram is youngest");
            }else{
                System.out.println("Ajay is youngest");
            }
        }else {
            if (shyam < ajay) {
                System.out.println("Shyam is youngest");
            }else {
                System.out.println("Ajay is youngest");
            }
        }
        sc.close();
    }
}
