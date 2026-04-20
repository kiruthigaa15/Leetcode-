class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<k;i++){
             sum+=nums[n-1];
             nums[n-1]=nums[n-1]+1;
        }
        return sum;
    }
}