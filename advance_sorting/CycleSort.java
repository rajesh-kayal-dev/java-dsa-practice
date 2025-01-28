public class CycleSort {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,4,1,2,6};
        print(arr);
        cycleSort0toN(arr);
        print(arr);
    }

    //cycle sort for 0 to n
    public static void cycleSort0toN(int [] arr){
        int n = arr.length;
        int i =0;
        while(i<n){
            int ele = arr[i];
            int actPos = ele;
            //if element is not at the correct position then swap
            if (arr[i]<n && arr[i] != arr[actPos]) {
                swap(arr,i,actPos);
            }else{
                i++;
            }

        }
    }

    //cycle sort for 1 to n
    public static void cycleSort(int [] arr){
        int n = arr.length;
        int i =0;
        while(i<n){
            int ele = arr[i];
            int actPos = ele-1;
            //if element is not at the correct position then swap
            if (arr[i]<n && arr[i] != arr[actPos]) {
                swap(arr,i,actPos);
            }else{
                i++;
            }

        }
    }
}
