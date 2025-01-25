package ArraysAndArrayList;

import java.util.ArrayList;

public class basicOfarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr +" "+ arr.size());
        System.out.println(arr);

        // for (int i = 0; i < 6; i++) {
        //     System.out.print(arr.get(i)+" ");
        // }

        arr.add(90);

        System.out.println(arr +" "+ arr.size());
        System.out.println(arr);
        arr.set(0, 100); //update
        System.err.println(arr.get(0));//get print array index
        arr.remove(1); //remove 1st index
        System.out.println(arr); 
        System.out.println(arr +" "+ arr.size());     
    }
}
