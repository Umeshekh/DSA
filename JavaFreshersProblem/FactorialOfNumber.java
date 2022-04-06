// this function is used to get factorial of a number by iteration technique    
public static int getFactorial1(int num) {
       if(num == 1) {
           return 1;
       }

       int sum = 1;

        for(int i=2;i<=num;i++) {
           sum = sum*i;
        }
        return sum;
    }


// Factorial of a number using recursion
 public static int getFactorial(int num) {
       //base case
       if(num ==0) {
           return 1;
       }
       return num* getFactorial(num-1);
   }
