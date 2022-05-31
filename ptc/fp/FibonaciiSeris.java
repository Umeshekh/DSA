package FPL;

public class Fibonacci_series {

    public static void main(String[] args) {
        int first=0,second=1;
        System.out.print(second+" ");
        int sum=0;
        for(int i=2;sum<=20;i++) {
            sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;
        }
    }

}

// output 1 1 2 3 5 8 13 21 
