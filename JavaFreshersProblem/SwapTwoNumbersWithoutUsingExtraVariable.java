 public static void SwapNumbers(int n1,int n2) {
        n1= n1 + n2;
        n2 = n1-n2;    // (n1+n2)-n2 = n1;
        n1=n1-n2 ;      // i.e (n1+n2)-n1 = n2;
        System.out.println("Numbers after swapping");
        System.out.println("n1:"+n1+" "+"n2:"+n2);
    }
