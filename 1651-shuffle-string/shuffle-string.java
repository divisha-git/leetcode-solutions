class Solution {
    public String restoreString(String s, int[] indices) {

        String str = "";

        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < indices.length; j++){
                if(indices[j] == i){
                    str += s.charAt(j);
                }
            }
        }

        return str;
    }
}