package Module3;
import java.util.Scanner;
public class CompositNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int x =0;//means prime number
        for (int i = 2; i<=n-1; i++) {
            if (n%i==0) {
                System.out.println("composit number");
                x=1; //1 means composite
                break;
            }
        }
        if(n==1){
            System.out.println("Niether Prime nor composit");
        } 
        else if(x==0) {
            System.out.println("Prime number");
        }
        sc.close();
    }
}
