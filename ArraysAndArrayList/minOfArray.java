package ArraysAndArrayList;

public class minOfArray {
    public static void main(String[] args) {
        int [] arr = {3,4,6,7,9,10};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
           min = Math.min(min, arr[i]);
        }

        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
           if(arr[i] !=min){
            secMin = Math.min(secMin, arr[i]);
           }
        }
        System.out.print("Min Value is: "+min+"\n");
        System.out.print("Second min Value is: "+secMin+"\n");
    }
}
