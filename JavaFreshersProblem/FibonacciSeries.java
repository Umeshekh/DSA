public static void getFibonacciSeries(int count) {
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

// For count =10
//output: 0 1 1 2 3 5 8 13 21 34
