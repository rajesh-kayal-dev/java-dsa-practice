package Module3;

public class Predict {
    public static void main(String[] args) {
        int x =4,y=0;
        while (x >= 0) {
            x--; //3 //2 //1 //0 //-1
            y++; //1 //2 //3 //4 //5
            if (x == y) { //2 //2
                continue;
            }else{
                System.out.println(x+" "+y); //3 1 //1 3 //0 4 //-1 5
            }
        }
    }
    
}
