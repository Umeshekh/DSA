   public static boolean isArmstrong(int num) {
        int last,digits=0,temp,sum=0;
        temp=num;
        while (temp > 0) {
            temp = temp/10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
           last = temp%10;
           sum += Math.pow(last,digits);
           temp = temp/10;
        }

        if(num == sum) {
            return true;
        }
      
        return false;

    }
