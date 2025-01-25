package basicSorting;

public class InsertionSort {
    public static void Print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void Swap(int arr[],int i,int j){
        arr[i]=arr[i] + arr[j]; //a=a+b
        arr[j]=arr[i] - arr[j]; //b=a-b
        arr[i]= arr[i]- arr[j]; //a=a-b
    }

    public static void main(String[] args) {
        int arr []={1,3,5,7,6,5,10,13,12,11};
        System.out.println("\nArray Before Sort:");
        Print(arr);
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >1 ; j--) {
                if (arr[j]<arr[j-1]){
                    Swap(arr,i,j);
                }
            }
        }
        System.out.println("\nArray After Sort:");
        Print(arr);
    }
}
