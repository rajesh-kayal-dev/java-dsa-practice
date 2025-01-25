package Module3;
import java.util.Scanner;
public class TbaleOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int n = sc.nextInt();
        int num=1;
        for(int i=n;i<=10*n;i+=n){
            System.out.println(n+" * "+ num++ +" = "+i);
        }
        sc.close();
    }
}
