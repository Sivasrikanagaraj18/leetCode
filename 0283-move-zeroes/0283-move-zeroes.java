class Solution {
    public void moveZeroes(int[] nums) {
        int id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[id]=nums[i];
                id++;
            }
        }
        for(int i=id;i<nums.length;i++){
            nums[id++]=0;
        }
    }
}