public class PrimeNumber {
    public static void main(String[] args){
        int num = 5;
        int count = 0;
        if(num>1){
            for(int i=1; i<=num; i++){
                if(num % i== 0)
                    count++;

                if(count == 2){
                    System.out.println(num +"number is prime number");
                }
                else{
                    System.out.println(num +"number is not a prime number");
                }
            }

        }
        else{
            System.out.println("number is not prime number");
        }
    }

}
