class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg++;
            }
            if(nums[i]>0){
                pos++;
            }
             max=Math.max(pos,neg);
        }
        return max;
    }
}