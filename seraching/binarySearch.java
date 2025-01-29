package seraching;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={4,5,7,8,10,12,15,16,20,24};
        int target = 10;
        int n = arr.length;
        int low =0,high = n-1;
        boolean flag = false;

        while (low <= high) {
            int mid = low + (high - low) /2;
            if(arr[mid] == target){
                flag= true;
                break;
            }
            else if (arr[mid]< target) high = mid + 1;
            else if (arr[mid]> target) high = mid - 1;
        }
        if(flag == true) System.out.println("Target Present");
        else System.out.println("Target not found!");
    }
}
