package ArraysAndArrayList;
public class rollNumber {
    public static void main(String[] args) {
        int arr [] ={55,22,66,33,53,99,100};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]<35) {
                System.out.print(i+", ");
            }
        }
    }
}
