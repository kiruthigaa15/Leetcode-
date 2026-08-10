class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        String s=String.valueOf(n);
        int len=s.length();
        int[]arr=new int[len];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=n%10;
            n=n/10;

        }
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int mul=entry.getKey()*entry.getValue();
             sum=sum+mul;
        }
        return sum;
    }
}