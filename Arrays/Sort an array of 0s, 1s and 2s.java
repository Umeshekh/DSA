class Solution
{
    public static void sort012(int a[], int n)
    {
        int a0=0;
        int a1=0;
        int a2=0;
        int i=0;
        while(i<n) {
            if(a[i]==0)
              a0++;
            if(a[i]==1) 
              a1++;
            if(a[i]==2)
              a2++;
             
            i++;  
        }
        
        int j=0;
        while(j<n) {
            if(j<a0) 
              a[j]=0;
            else if(j<(a0+a1))
              a[j]=1;
            else
              a[j]=2;
             
             j++; 
        }
    }
}
