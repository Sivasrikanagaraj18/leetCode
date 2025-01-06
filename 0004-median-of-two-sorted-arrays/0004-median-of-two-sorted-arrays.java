class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        int[] nums3=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
         nums3[k++]=nums1[i];
        }
         for(int i=0;i<nums2.length;i++){
         nums3[k++]=nums2[i];
        }
        Arrays.sort(nums3);
        int t=nums3.length;
        if(t%2==1){
            return (double) nums3[t/2];
        }
        else{
            int m1=nums3[t/2-1];
            int m2=nums3[t/2];
            return ((double) m1+(double) m2)/2.0;
        } 
    }
}