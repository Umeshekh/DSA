/* https://leetcode.com/problems/reverse-words-in-a-string/ */

class Solution {
    public String reverseWords(String s) {
      // we will be using append method funcationality of StringBuilder class. 
        StringBuilder reversed = new StringBuilder();
        int j=s.length(); // initially j will be equal to string length+1 ,,,considering 0 based index.
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)==' '){  // we will be shifting the value j when the current char from string is a whitespace.
                j=i;
            }
            else if(i==0 || s.charAt(i-1)==' ') { // if we reach to end or curr-1 char is ' ' then
                if(reversed.length()!=0) {  // considering we have inserted something into our reversed.
                    reversed.append(' ');
                }
                reversed.append(s.substring(i,j));  /// we will append a substring starting from i to j ...here jth indext will not get include.
            }
            
        }
        
        return reversed.toString();
        
    }
}
