package Module3;

public class EvenOdd1to100 {
    public static void main(String[] args) {
        //100 rounds
        // for(int i = 1; i<=100;i++){
        //     if (i%2==0) {
        //         System.out.println(i);
        //     }
        // }

        //50 rounds //space and time complesxcity
        for (int i = 2; i < 100; i+=2) {
            System.out.println("Even Number: "+i);
        }
    }
}
