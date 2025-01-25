package Module3;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        //1 3 5 7 9....
        //4 7 10 13....
        for(int i = 4;i<=3*n-1;i+=3){
            System.out.println(i);
        }//n rounds

        sc.close();
    }
}
