class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
        
      
        if(s.indexOf(ch) == s.lastIndexOf(ch)){
                  return i;}
        
    }
        return -1;
    
}
}
