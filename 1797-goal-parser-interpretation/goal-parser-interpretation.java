class Solution {
    public String interpret(String command) {
         String res = "";
        for(int i=0;i<command.length();i++){
             if(command.charAt(i) == 'G') {
                res = res + "G";
            }
            if(command.charAt(i)=='(' &&command.charAt(i+1)==')'){
               res=res+"o";
               i++;
            }
             if(command.charAt(i)=='('&& command.charAt(i+1)=='a'&& command.charAt(i+2)=='l'){
                res=res+ "al";
                i=i+3;
        }
        }
        return res;
        
    }
}