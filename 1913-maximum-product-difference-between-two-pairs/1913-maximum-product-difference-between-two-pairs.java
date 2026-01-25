class Solution {
    public int maxProductDifference(int[] nums) {

        int small0 = 1_000_000;
        int small1 = 1_000_000;

        int big0 = 0;
        int big1 = 0;

        for (int num : nums) {

            if (num < small0) {
                small1 = small0;
                small0 = num;
            } else if (num < small1) {
                small1 = num;
            }

            if (num > big0) {
                big1 = big0;
                big0 = num;
            } else if (num > big1) {
                big1 = num;
            }
        }

        return (big0 * big1) - (small0 * small1);
    }
}