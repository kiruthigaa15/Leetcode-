class Solution {
    public int minOperations(String[] logs) {
        int size = 0;
        for(String log : logs){
            if(log.equals("../")) {
                if(size > 0) size--; 
            }
            else if(log.equals("./")) continue;
            else size++;
        }
        return size;
    }
}