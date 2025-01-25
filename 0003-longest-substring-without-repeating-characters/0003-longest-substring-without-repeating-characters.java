class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sum=new HashSet<>();
        int l=0,r=0;
        int max=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(!sum.contains(ch)){
            sum.add(ch);
            max=Math.max(max,r-l+1);
            r++;

            }
            else{
                sum.remove(s.charAt(l));
                l++;
            }
        }
       return max;  

    }
}