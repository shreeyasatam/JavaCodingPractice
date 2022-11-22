public class PalindromeString {
    String s1;

    public PalindromeString(String st){
        this.s1 = st;
    }

    public void stPalindrome(){
        String revSt = "";
        boolean ans = false;
        int stLength = s1.length();

        for(int i=stLength-1; i>=0; i--){
            revSt += s1.charAt(i);

        }
        if(s1.equals(revSt)){
            ans = true;
            System.out.println(s1 + " is palindrome");
        }
        else {System.out.println(s1 + " is not palindrome");
        }

    }

    public static void main(String[] args){
        PalindromeString st1 = new PalindromeString("malayalam");
        st1.stPalindrome();
    }
}
