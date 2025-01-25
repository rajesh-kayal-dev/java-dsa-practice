package Module3;
import java.util.Scanner;
public class OddEvenContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        //100 iterations
        // for (int i = 1; i <=n; i++) {
        //     if(i%2==0) {
        //         System.out.print(i+", ");
        //     }
        // }

        // 50 iterations
        // for (int i = 1; i <=n; i+=2) {
        //         System.out.print(i+", ");
        // }

        //100 iterations (continue)

        for (int i = 1; i <=n; i++) {
            if(i%2!=0) continue;
            System.out.print(i+", ");
        }
        sc.close();
    }
}
