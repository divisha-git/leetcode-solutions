class Solution {
    public List<String> cellsInRange(String s) {
        char startcol= s.charAt(0);
        int startrow=s.charAt(1)-'0';
        int endcol=s.charAt(3);
        int endrow=s.charAt(4)-'0';
        List<String> ans = new ArrayList<>();
        for(char c=startcol;c<=endcol;c++){
            for(int i=startrow;i<=endrow;i++){
                ans.add(c+""+i);}
        }
        return ans;
    }

}