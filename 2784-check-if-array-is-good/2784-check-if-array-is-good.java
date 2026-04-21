class Solution {
    public boolean isGood(int[] nums) {
        // 1,2 ...n-1,n,n
        int n = nums.length - 1;

        Boolean isNHighest = checkNHighest(nums, n);
        if(isNHighest == false) return false;

        int[] freq = StoreFrequency(nums);

        // n appears twice
        if(freq[n] != 2) return false;

        // elements 1 to n - 1 appear exactly once
        for(int i = 1; i < nums.length - 1; i++) {
            if(freq[i] != 1) return false;
        }
        
        return true;
    }

    public Boolean checkNHighest(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            if(n < arr[i]) return false;
        }
        return true;
    } 

    public int[] StoreFrequency(int[] nums) {
        int[] freq = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        return freq;
    }
}