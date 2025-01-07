class Solution {
    public int[] getConcatenation(int[] nums) {
     int[] nums1=new int[nums.length*2];
     int j=0;
     for(int i=0;i<nums.length;i++){
        nums1[j]=nums[i];
        j++;
     }   
     for(int i=0;i<nums.length;i++){
        nums1[j]=nums[i];
        j++;
     }
     return nums1;
    }
}