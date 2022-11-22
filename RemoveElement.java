public class RemoveElement {

    public int removeElement(int[] num, int val){
        int i = 0;
        for(int j=0; j<num.length; j++){
            if(num[j] != val){
                num[i] = num[j];
                i++;
            }
        }
        return i;

    }
}
