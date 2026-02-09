class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int fivePer = n / 20;
        double sum = 0;

        for (int i = fivePer; i < n - fivePer; i++) {
            sum += arr[i];
        }
        return sum / (n - 2 * fivePer);
    }
}