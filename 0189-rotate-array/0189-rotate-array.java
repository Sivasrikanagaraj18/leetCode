class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] rotate=new int[n];
        for(int i=0;i<nums.length;i++){
         rotate[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=rotate[i];
        }
}
}