class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
       for(int i=nums.length-1;i>=0;i--){
        if(nums[l]>=nums[r]){
            res[i]=nums[l];
            l++;
        }
        else{
            res[i]=nums[r];
            r--;
        }
      }
      return res;
    }
}