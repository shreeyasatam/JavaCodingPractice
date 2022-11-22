public class FibonacciSeries {
    int number;

    public FibonacciSeries(int n1){
        this.number = n1;
    }

    public void fibonacci(){
        int num1 = 0;
        int num2 = 1;
        if(number == 0){
            System.out.print(num1 + " ");
        }
        for(int i=2; i<= number; i++){
            System.out.print(num2 + " ");
            int num3 = num1 + num2;
             num1 = num2;
             num2 = num3;
        }

    }
    public static void main(String[] args){
        FibonacciSeries f1 = new FibonacciSeries(10);
        f1.fibonacci();

    }
}
