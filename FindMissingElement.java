import java.util.*;
public class FindMissingElement {
    public static void missingElement(int a[], int s, int l){
        Set<Integer> hs = new HashSet<Integer>();
        // inswerting values into hashset
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        for(int i=s; i<l; i++){
            if(!hs.contains(i)){
              System.out.print(i + " ");
            }
        }



    }
}
