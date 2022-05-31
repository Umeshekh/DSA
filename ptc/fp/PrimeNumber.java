package FPL;

public class PrimeNumber {
    // instance variable, static so that it will be accessible inside the static method.  
    static int i=2;
    // recursive approach
    static boolean isPrime1(int num) {
        // case 1
        if(num==0 || num==1) {
            return false;
        }

        //case 1
        if(num==i) {
            return true;
        }
        // base case
        if(num %i==0) {
            return false;
        }
        i++;
        return isPrime(num);
    }

    // iterative approach
    static boolean isPrime(int num) {

        for(int i=2;i<=num/2;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int num=17;
        boolean result=isPrime1(num);
        if(result==true) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}
