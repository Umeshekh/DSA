//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        int temp=0;
        for(int i=0;i<k;i++) {
            temp=arr[i];
        }
        return temp;
    } 
}
