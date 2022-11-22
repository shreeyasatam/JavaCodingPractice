public class PrimeOrNot {
    int number;

    public PrimeOrNot(int num1){
        this.number = num1;
    }

    public void Prime(){

        boolean flag = false;
        for(int i = 2; i<number/2; i++){
            if(number % i == 0){
                flag = true;
                        break;
            }
        }
        if(!flag){
            System.out.println(number +" is prime number");
        }else{
            System.out.println(number +" is not prime number");
        }

    }

    public static void main(String[] args){
        PrimeOrNot n1 = new PrimeOrNot(30);
        n1.Prime();

    }
}
