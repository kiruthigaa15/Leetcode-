class Solution {
    public int minStartValue(int[] nums) {
        int min=0;
        int tot=0;
        for(int n:nums){
            tot +=n;
            min=Math.min(min,tot);
        }
        return 1-min;
        
    }
}