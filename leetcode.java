public class leetcode {

    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                int comp = target - nums[i];
                if(comp == nums[j]){
                   return new int[] {i, j};


            }
        }

    }


}
