  public static String reverseAString(String str) {
        String rev="";
        for(int i=0;i<=str.length()-1;i++) {
            rev=str.charAt(i)+rev;
            // charAt method of String class returns the character of specified index i.
        }

        return rev;
    }
