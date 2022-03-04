//Find first and last positions of an element in a sorted array
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x) // x is the element whose first and last occurance want to find. 
    {
        ArrayList<Long> result= new ArrayList<Long>();
        int c1=-1;
        int c2=-1;
        int flag=0;
        for(int i=0;i<n;i++) {
            if(arr[i] == x ) {
                
                if(flag == 0) {
                    c1=i;
                    flag =1;
                }
                c2=i;
            
            }
        }
        long c11=(long)c1;
        long c12=(long)c2;
        result.add(c11);
        result.add(c12);
        
        return result;
    }
}
