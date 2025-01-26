public class QuickSorting {
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int arr[],int low ,int high){
        int povit = arr[high];
        int i = low -1;
        for (int j = low; j < high;j++){
            if (arr[j]<povit){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i +1;
    }
    public static void QuckSort(int arr[],int low ,int high){
        if (low < high){
            int povit = partition(arr,low,high);
            QuckSort(arr,low,povit-1);
            QuckSort(arr,povit+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,44,22,53,33,49};
        int n=arr.length;
        System.out.println("Before sorting");
        print(arr);
        QuckSort(arr,0,n-1);
        System.out.println("After sorting");
        print(arr);

    }
}