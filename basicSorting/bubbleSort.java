package basicSorting;

public class bubbleSort {
    public static void print(int arr[]){
        for (int ele : arr ){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, -2, 0, 4, 7, 10, 9};
        int n = arr.length;

        System.out.println("Before Sorting:");
        print(arr);

        // Optimized BubbleSort for decreasing order
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {// Change condition for decreasing order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag==true) break;
        }

        System.out.println("After Sorting:");
        print(arr);
    }
}
