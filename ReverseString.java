public class ReverseString {
    public static void main(String[] args){
        String str = "welcome";
        String orgString = str;
        String rev = "";
       /* int lenString = str.length();
        for(int i=lenString-1; i>=0; i--){
            rev = rev+str.charAt(i);
            System.out.println("Reverse string is "+ rev );
            */
        char a[] = str.toCharArray();
        int len = a.length;
        for(int i=len-1; i>=0; i--){
        rev = rev + a[i];
        System.out.println(rev);

        }
        if(orgString.equals(rev)){
            System.out.print(orgString + " is palindrome");
        }else {
            System.out.print(orgString + " is not palindrome");
        }
    }
}
