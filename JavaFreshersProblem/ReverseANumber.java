  public static int GetReverseNumber(int num) {
        int newNum=0,last;
        while (num != 0) {
           last = num%10;
           newNum = newNum*10 + last;
           num = num/10;
        }

        return newNum;

    }
