package ArraysAndArrayList;

public class shortZerosOnes{
    public static void main(String[] args) {
        int arr[]={0,0,1,0,0,0,1,1,1,0};
        int n =arr.length;
//        method 1
//        int noOfZeros=0, noOfOness=0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==0) noOfZeros++;
//            else noOfOness++;
//        }
//        for (int i = 0; i < n; i++) {
//            if (i<noOfZeros) arr[i]=0;
//            else arr[i]=1;
//        }
//        for (int ele : arr){
//            System.out.println(ele);
//        }

//        method 2
        int i=0,j=n-1;
        while (i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) j--;
                else if (arr[i]==1 && arr[j]==0){
                    arr[i]=0;
                    arr[j]=1;
                    i++;
                    j--;
                }
        }
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}