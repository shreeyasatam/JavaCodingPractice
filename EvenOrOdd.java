import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = NextInt(sc);
        int evenCount = 0;
        int oddCount = 0;
        while(number > 0){
            int rem = number % 10;
            if(rem % 2 == 0){
                evenCount++;

            }else{
                oddCount++;
            }
            number = number / 10;
        }
        System.out.println("even digits in the number are "+evenCount);
        System.out.println("Odd digits in the number are "+oddCount);
    }

}
