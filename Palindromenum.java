public class Palindromenum {
    int num;

    public Palindromenum(int n1){
        this.num = n1;
    }

    public void numPalindrome(){
        int originalNum = num;
        int revNun = 0;
        int remainder = 0;
        while(num !=0 ){
            remainder = num % 10;
            revNun = revNun * 10 + remainder;
            num /= 10;
        }
        if(originalNum == revNun){
            System.out.println(originalNum + " is a palindrome");

        }else{
            System.out.println(originalNum + " is a not palindrome");
        }

    }

    public static void main(String[] args){
        Palindromenum p1 = new Palindromenum(1001);
        Palindromenum p2 = new Palindromenum(1201);
        p1.numPalindrome();
        p2.numPalindrome();

    }
}
