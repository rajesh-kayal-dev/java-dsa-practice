package Array2D;
class forEach {
    public static void main(String[] args) {
        int arr[][]={{123},{456}};
        for (int [] ele : arr){
            for (int ble : ele){
                System.out.print(ble+" ");
            }
            System.out.println();
        }
    }
}