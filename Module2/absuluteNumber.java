package Module2;

import java.util.Scanner;

public class absuluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0) {
            System.out.print(-n);
        }else{
            System.out.print(n);
        }
        sc.close();
    }
    

}
