class Solution {
    public int findNumbers(int[] nums) {
      int c=0;
      for(int i=0;i<nums.length;i++){
        int num=nums[i];
        if(num==0)
        {
            continue;
        }
        int digit=(int) Math.log10(num)+1;  
        if(digit%2==0){
            c++;
        }
      }
    return c;
}
}
