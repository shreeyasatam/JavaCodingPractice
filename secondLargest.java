public class secondLargest {
    public static int getsecondLargest(int[] array){
        int temp = 0;
        int arraylength = array.length;
        for(int i=0; i<arraylength; i++){
            for(int j=i+1;j<arraylength; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }
        return array[arraylength - 2];

    }

    public static void main(String[] args){
        int[] a = {2, 6, 9, 3, 4};
        int [] b = {90, 20,80, 30};
        System.out.println("Second largest number in array is :" +getsecondLargest(a));
        System.out.println("Second largest number in array is :" +getsecondLargest(b));
    }
}
