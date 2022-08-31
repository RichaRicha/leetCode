class TwoSum {

    List<Integer> nums;
    public TwoSum() {
        nums = new ArrayList<>();
    }
    
    public void add(int number) {
        nums.add(number);
    }
    
    public boolean find(int value) {
        int [] numbers = nums.stream().mapToInt(Integer::intValue).toArray();
        return twoSum(numbers, value);
    }
    
    public boolean twoSum(int[] nums, int target) {
        boolean sum = false;
        Map<Integer,Integer> numMap = new HashMap<>();
        if ((nums.length >= 2 && nums.length <= Math.pow(10, 4)) &&
                (target >= (-Math.pow(10, 9)) && target <= Math.pow(10, 9))) {
            for(int i = 0; i < nums.length; i++){
               if (nums[i] <= Math.pow(10, 9) && nums[i] >= (-Math.pow(10, 9))) { 
                    if(numMap.containsKey(target-nums[i])){
                        sum = true;
                        break;
                    }else{
                        numMap.put(nums[i], i);
                    }   
               }
            }
        }    
        return sum;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */