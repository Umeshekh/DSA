// this method finds the key in the array using ternayr search and return it's index.   

public static int getIndexOfElement(int[] arr,int l,int r,int key) {
       if(r>=l) {
           int mid1= l + (r-l)/3;
           int mid2= r-(r-l)/3;

           if(key == arr[mid1]) {
               return mid1;
           }
           else if(key == arr[mid2]) {
               return mid2;
           }
           else if(key < arr[mid1]) {
               return getIndexOfElement(arr,l,mid1-1,key);
           }
           else if(key > arr[mid2]) {
               return getIndexOfElement(arr,mid2+1,r,key);
           }
           else {
               return getIndexOfElement(arr,mid1+1,mid2-1,key);
           }
       }


       return -1; // if element not found then return -1;
   }
