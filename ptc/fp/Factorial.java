package FPL;

public class Factorial {
    
    // Recursive approach
    public static int getFactorial2(int num) {
        if(num==0) {
            return 1;
        }
        return num * getFactorial2(num-1);
    }

  // iterative approach
    public static int getFactorial1(int num) {
        // base case
        if(num==1 || num==0) {
            return 1;

        }
        int result=1;
        for(int i=2;i<=num;i++) {
            result = result*i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getFactorial1(5));
        System.out.println(getFactorial2(5));
    }
}
