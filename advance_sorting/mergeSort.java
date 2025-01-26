public class mergeSort {
    public static void merge(int a[],int b[],int c[]) {
          int i=0,j=0,k=0;
          while(i<a.length && j<b.length){
              if(a[i]<=b[j]) c[k++]=a[i++];
              else c[k++]=b[j++];
          }
          while(i<a.length) c[k++]=a[i++];
          while (j<b.length) c[k++]=b[j++];
    }
    public static void mergeSort(int arr[]) {
        int n=arr.length;
        if (n ==1) return;
        //create two array size n/2
        int a [] = new int[n/2];
        int b [] = new int[n-n/2];
        //copy pesting
        for (int i = 0; i < n/2; i++) {
            a[i]=arr[i];
        }
        for (int j = 0; j <n-n/2 ; j++) {
            b[j]=arr[j+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);



    }
    public static void print(int arr[]){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr []={20,40,60,12,44,75,88};
        print(arr);
        mergeSort(arr);
        print(arr); 
    }
}
