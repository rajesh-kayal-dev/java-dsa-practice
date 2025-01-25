package basicSorting;

public class selectionSort {
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
        int arr []={1,3,5,-7,-6,-5,10,13,12,11};
        System.out.println("\nArray Before Sort:");
        Print(arr);
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int max = Integer.MIN_VALUE;// Change condition for assending order
            int maxIndex=-1;
            for (int j = i; j < n; j++) {
                if (arr[j]>max){ // Change condition for assending order
                    max=arr[j];
                    maxIndex=j;
                }
            }
            Swap(arr,i,maxIndex);
        }
        System.out.println("\nArray After Sort:");
        Print(arr);
    }
}
