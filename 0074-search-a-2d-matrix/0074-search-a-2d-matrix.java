class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
       for(int[] num:arr){
           if(num[num.length-1]>=target){
               if(isContains(num,target)){
                return true;
               }
       }
       }
       return false;
    }
    public static boolean isContains(int[] nums,int target){
             int l=0;
             int r=nums.length-1;
             while(l<=r){
                 int mid=l+(r-l)/2;
                 if(nums[mid]==target){
                     return true;
                 } 
                 else if(nums[mid]<target) {
                     l=mid+1;
                 }
                 else{
                     r=mid-1;
                 }
             }
                 return false;
             }
}