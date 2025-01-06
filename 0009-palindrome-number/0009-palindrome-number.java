class Solution {
    public boolean isPalindrome(int x) {
      int s=0;
      if(x<0||(x%10==0&&x!=0)){
        return false;
      }
      int t=x;
      while(x!=0){
        int r=x%10;
        s=s*10+r;
        x=x/10;
      }
      return t==s;  
    }
}