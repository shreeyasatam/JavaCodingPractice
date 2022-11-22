public class LongestCommonSuffix {
    public String CommonSuffix(String[] strs){

        if(strs == null || strs.length == 0 ){
            return "";
        }
            String prefix = strs[0];
            for(int i=1; i<strs.length; i++){
                String currentW = strs[i];
                int j=0;
                while(j<currentW.length() && j<prefix.length() && prefix.charAt(j) == currentW.charAt(j)){

                        j++;
                    }
                    prefix = currentW.substring(0, j);
                    if(j==0)
                        return "";
            } return prefix;

    }
}
