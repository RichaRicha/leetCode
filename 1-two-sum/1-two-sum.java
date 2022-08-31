class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer,Integer> numMap = new HashMap<>();
        if ((nums.length >= 2 && nums.length <= Math.pow(10, 4)) &&
                (target >= (-Math.pow(10, 9)) && target <= Math.pow(10, 9))) {
            for(int i = 0; i < nums.length; i++){
               if (nums[i] <= Math.pow(10, 9) && nums[i] >= (-Math.pow(10, 9))) { 
                    if(numMap.containsKey(target-nums[i])){
                        indices[0] = i;
                        indices[1] = numMap.get(target-nums[i]);
                    }else{
                        numMap.put(nums[i], i);
                    }   
               }
            }
        }    
        return indices;
    }
}