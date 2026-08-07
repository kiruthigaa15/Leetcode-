class Solution {
    public int smallestNumber(int n, int t) {
        int pro=1;
      
      while(n!=0){
         pro=1;
        int i=n;
        while(i!=0){
            int temp=i%10;
           pro= pro*temp;
           i=i/10;
        }
        if(pro%t==0){
            return n;
        
        }
         n++;
      }
     
      return n;
}
}