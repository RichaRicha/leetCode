class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(numMap.containsKey(target-nums[i])){
                indices[0] = i;
                indices[1] = numMap.get(target-nums[i]);
            }else{
                numMap.put(nums[i], i);
            }      
        }
        return indices;
    }
}