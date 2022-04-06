 public static int getSomeOfDigits(int num) {
        int sum=0,last;
        while (num > 0) {
            last = num%10;
            sum += last;
            num = num/10;
        }
        return sum;
    }
