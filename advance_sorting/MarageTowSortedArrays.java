
import java.util.Scanner;

public class MarageTowSortedArrays {
    public static void print(int arr[]){
            for(int ele : arr){
                System.out.print(ele + " ");
            }
        System.out.println();
    }

    public static void marge(int a[],int b[],int c[]){
        int i = 0,j=0,k=0;
        while (i<a.length && j<b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
            while (i<a.length) c[k++]=a[i++];
            while (j<b.length) c[k++]=b[j++];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array:");
        int n1 = sc.nextInt();
        System.out.print("Enter the size of 2st array:");
        int n2 = sc.nextInt();
        System.out.print("Enter the vlues of 1st array:");
        int a[]= new int[n1];
        for (int i = 0; i <n1 ; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the vlues of 2st array:");
        int b[]= new int[n2];
        for (int j = 0; j <n2 ; j++) {
            b[j] = sc.nextInt();
        }
        System.out.print("1st Array: ");
        print(a);
        System.out.print("2nd Array: ");
        print(b);
        int c [] = new int[a.length+b.length];
        marge(a,b,c);
        System.out.print("Merged Array: ");
        print(c);

    }
}
