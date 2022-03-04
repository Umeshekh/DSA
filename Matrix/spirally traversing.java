import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int l=0; //String row index
        int T=0; //String col index
        int B= matrix.length-1; //ending col index
        int R=matrix[0].length-1;  //ending row index
        int dir=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(l <= R && T <=B) {
            if(dir==0) { //if dir==0 traversing Left ---> Right
            for(int i=l;i<=R;++i) {
                ans.add(matrix[T][i]);
                 
            }
            T +=1;
            }
            else if(dir==1) { // if dir==1 traversing Top ---> Bottom
                for(int i=T;i<=B;i++) {
                    ans.add(matrix[i][R]);
                }
                R -=1;
            }
            else if(dir==2){ // if dir==2 traversing Right --> Bottom 
                for(int i=R;i>=l;i--) {
                    ans.add(matrix[B][i]);
                }
                B -=1;
            }
            else if(dir==3) { // if dir==3 traversing Bottom --> Top
                for(int i=B;i>=T;i--) {
                    ans.add(matrix[i][l]);
                }
                l +=1;
            }
            dir =(dir+1) % 4; //on each iteration there is need to update dir variable
            
        }
        return ans;
    }
}
