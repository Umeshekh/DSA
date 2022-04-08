  public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        // x * k = currEle - x;
        
        // We can solve this problem using linear traversal 
        // i.e checking all element one by one 
        // but it would not fit in the space complexity
        
        
        // the approach we are going to use here is simple 
        // we will take diff between current element and x say it is diff
        // the lement x will be present at least diff/k step away. 
        int i=0;
        while(i<n) {
            if(arr[i]==x) {
                return i;
            }
            // here we are taking max with 1 just to make sure that we are going at least one step ahead. 
            i = i+Math.max(1,Math.abs(arr[i]-x)/k);
        }
        return -1;
    }
