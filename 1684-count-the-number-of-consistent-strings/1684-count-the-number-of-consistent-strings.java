class Solution {
public int countConsistentStrings(String allowed, String[] words) {
int count=0;
for(String word:words){
int n=word.length();
for(int i=0;i<n;i++){
if(!allowed.contains(String.valueOf(word.charAt(i)))){
count++;
break;
}
}
}
return words.length-count;
}
}