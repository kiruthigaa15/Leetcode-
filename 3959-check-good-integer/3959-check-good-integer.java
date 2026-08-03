class Solution {
    public boolean checkGoodInteger(int n) {
        String s=String.valueOf(n);
        char[]arr=s.toCharArray();
        int sum=0;
        int squr=0;

        for(int i=0;i<arr.length;i++){
            int dig=arr[i]-'0';
            sum=sum+dig;
squr=squr+dig*dig;
        }
       int diff=squr-sum;
       if(diff<50||diff==0){
    return false;
       }
       
       return true;
    }
}