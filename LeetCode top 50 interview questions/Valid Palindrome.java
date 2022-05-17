
//Question link : https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
      /* This takes advantage of the negation (^) operator in character classes 
      which basically says, "match everything except the following characters."
         */
        s=s.replaceAll("[^a-z0-9]","");
        int i=0,j=s.length()-1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
        
    }
}
