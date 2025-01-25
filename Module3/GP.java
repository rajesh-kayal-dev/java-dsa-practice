package Module3;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=4;
        }
        sc.close();

    }
}
