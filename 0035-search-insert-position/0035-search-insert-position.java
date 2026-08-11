class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=1;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]>target){
                return i;
            }
        }
          return nums.length;
    }
}