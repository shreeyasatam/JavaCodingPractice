
    import java.util.Scanner;


    public class Palindrome {

        public static void main(String[] args) {

            int newN = 1234;

            int x = newN;
            int reverse = 0;
            while (newN != 0){

                reverse = reverse * 10 + newN % 10;
                newN /= 10;

            }
            if(x == reverse){
                System.out.println(x +" is palindrome number");
            }else{
                System.out.println(x +" is not a palindrome number");

            }






        }



    }

