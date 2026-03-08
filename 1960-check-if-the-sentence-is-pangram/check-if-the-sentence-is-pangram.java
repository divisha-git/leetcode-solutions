class Solution {
    public boolean checkIfPangram(String sentence) {
     if(sentence.chars().distinct().count()==26){
     return true;
    }
return false;
     }}