    private boolean bin_search(int arr[],int low,int high,int target) {
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==target) {
                return true;
            }
            else if(arr[mid] > target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
    
        }
        return false;
    }
    
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        for(int i=0;i<size;i++) {
            if(bin_search(arr,i+1,size-1,n+arr[i])) {
                return true;
            }
        }
        
        return false;
    }
