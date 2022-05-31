package FPL;

public class CheckVowels {

    public static boolean checkVowel(String str) {
        boolean flag = false;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                flag=true;
                break;
            }
        }
        
        return flag;
    }

    public static void main(String[] args) {
        String str="Umesh";
        System.out.println(checkVowel(str));

    }
}
