class Largest{
    static int array[] = {80, 90, 20, 10,5,55};
    static int max = array[0];

    public static int largest(){
        for(int i=1; i< array.length; i++){
            if(array[i] > max){
                max = array[i];


            }
        }  return max;
    }

    public static void main(String[] args){
        System.out.println("Largest in given array is " + largest());
    }
}