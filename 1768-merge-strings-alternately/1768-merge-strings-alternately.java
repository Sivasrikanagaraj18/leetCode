class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder br=new StringBuilder();
        while(i<word1.length()||i<word2.length()){
          if(i<word1.length()){
            br.append(word1.charAt(i));
          }
          if(i<word2.length()){
            br.append(word2.charAt(i));
          }
          i++;
        }
        return br.toString();
    }
}