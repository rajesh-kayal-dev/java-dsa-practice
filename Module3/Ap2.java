package Module3;
import java.util.Scanner;
public class Ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        //1 3 5 7 9....
        //4 7 10 13....
        //5 1 -3 -7 -15....
        int a =5, d=-4;
        for(int i =1; i<=n;i++){
            System.out.println(a);
            a+=d;
        }
        sc.close();

    }
}
