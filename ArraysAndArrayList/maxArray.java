package ArraysAndArrayList;

public class maxArray {
    public static void main(String[] args) {
        int arr [] = {12,3,4,5,6,7,9,11};
        int mx =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx) mx = arr[i]; 
        }
        int secMax=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>secMax && arr[i]!=mx) secMax=arr[i];
        }
        System.out.print("max is: "+mx +"\n");
        System.out.print("2nd max is: "+secMax);
    }
}
