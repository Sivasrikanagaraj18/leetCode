class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    HashSet<Character> num=new HashSet<>();
     for(int i=0;i <jewels.length();i++) {
            num.add(jewels.charAt(i));
        }
     int c=0;
     for(int i=0;i<stones.length();i++){
         if(num.contains(stones.charAt(i))){
             c++;
         }
     }
     return c;
    }
}