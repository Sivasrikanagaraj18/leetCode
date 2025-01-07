class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer br=new StringBuffer();
        StringBuffer br1=new StringBuffer();
        for(String num:word1){
            br.append(num);
        }
        for(String num:word2){
            br1.append(num);
        }
        String s1=br.toString();
        String s2=br1.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}