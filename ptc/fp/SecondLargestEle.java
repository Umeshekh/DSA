package FPL;

public class SecondLargestElement {

    public static int getSecondLargest(int[] arr,int n) {
        int temp;
      
       // sorting array using swapping.
        for(int i=0;i<n-1;i++) {
            for(int j=i;j<n-1;j++) {
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        return arr[n-2];

    }


    public static void main(String[] args) {
        int[] arr={4,2,5,24,7,11,7,56};
        int n=arr.length;
        System.out.println(getSecondLargest(arr,n));

    }
}
