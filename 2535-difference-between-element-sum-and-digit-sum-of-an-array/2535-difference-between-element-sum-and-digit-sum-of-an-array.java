class Solution {
    public int differenceOfSum(int[] nums) {
        int tsum=0;
        int dsum=0;
        for(int num:nums){
            tsum=tsum+num;

            while(num>0){
                dsum=dsum+num%10;
                num=num/10;

            }
        }
        return tsum-dsum;
    }
}