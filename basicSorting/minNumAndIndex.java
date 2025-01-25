package basicSorting;

public class minNumAndIndex {
    public static void main(String[] args) {
        int arr[]={0,1,-4,-6,8,10};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int minIndex=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("Minimum number is:"+min+" And index is:"+minIndex);
    }
}
