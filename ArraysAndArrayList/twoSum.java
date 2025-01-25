package ArraysAndArrayList;

public class twoSum {
    public static void main(String[] args) {
        int arr []={1,4,2,4,6,2,5,8};
        int target =14;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    System.out.println(arr[i] +" "+arr[j]);
                    break;
                }
            }
        }
    }
}
