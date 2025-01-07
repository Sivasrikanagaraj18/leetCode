class Solution {
    public void moveZeroes(int[] nums) {
        int id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[id]=nums[i];
                id++;
            }
        }
        while(id<nums.length) {
            nums[id]=0;
            id++;
        }
    }
}