package ArraysAndArrayList;

class MargeTwoSortedArray {
    public static void main(String[] args) {
        int a[]={10,25,30,40,70};
        int b[]={20,32,38,47,49,60};
        int c [] =new int[a.length + b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k]=a[i];
                i++;
            }else {
                c[k]=b[j];
                j++;
            }
            k++;
        }
    if (i==a.length){
        while (j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
    if (j==b.length){
        while (i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
    }
        for (int ele : c)
            System.out.println(ele);

    }
}