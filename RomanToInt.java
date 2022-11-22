import java.util.*;

public class RomanToInt {
    public int romanToInt(String str) {
        int result = 0;
        if(str == null || str.length() == 0){
            return 0;
        }

        HashMap<character, Integer> charMap = New HashMap<>();
        charMap.put('I', 1);
        charMap.put('v', 5);
        charMap.put('x', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        for(int i=0; i<str.length()-1; i++){
            if(charMap.get(str.charAt(i)) >= charMap.get(str.charAt(i+1))){
                result = result + charMap.get(str.charAt(i));


            }else{
                result = result - charMap.get(str.charAt(i));
            }
        }
        result = result + charMap.get(str.length()-1);
        return result;
    }
}



