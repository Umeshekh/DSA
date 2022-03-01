
   static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,c=0,j=0;
        while ( i<n) {
            if(arr[i] <= dep[j]) {
                c++;
            } else {
            j++; 
            }
        
        i++;
        }
        return c;
    }


//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
