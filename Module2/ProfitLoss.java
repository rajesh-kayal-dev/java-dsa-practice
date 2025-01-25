package Module2;

import java.util.Scanner;

/**
 * ProfitLoss s>c = profit | c>s = loss | s-c = profit amount | c-s=loss amount
 */
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price: ");
        int sp = sc.nextInt();

        System.out.print("Enter the cost price: ");
        int cp = sc.nextInt();

        if (sp > cp) {
            System.out.print("Profit is: "+(sp-cp));
        }else if(cp > sp){
            System.out.print("Loss is: "+(cp-sp));
        }else if(cp == sp){
            System.out.print("No Profit No Loss");
        }
        sc.close();
    }
    
}