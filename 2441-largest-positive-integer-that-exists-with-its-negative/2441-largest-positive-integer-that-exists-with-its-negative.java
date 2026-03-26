class Solution {
    public int findMaxK(int[] nums) {
        int[] freq = new int[1001];
        for(int i:nums){
            if(i < 0){
                freq[-i]++;
            }
        }
        int ans = -1;
        for(int i:nums){
            if(i > 0 && freq[i] > 0 && ans < i){
                ans = i;
            }
        }
        return ans;
    }

}