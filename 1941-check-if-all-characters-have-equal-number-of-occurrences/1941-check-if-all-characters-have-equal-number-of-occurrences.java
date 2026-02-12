class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] count = new int[26];
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            count[ch - 'a']++;
        }

        int expected = count[chars[0] - 'a'];

        for (int num : count) {
            if (num != 0 && expected != num) {
                return false;
            }
        }

        return true;
    }
}