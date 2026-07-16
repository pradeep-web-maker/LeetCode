class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ms=0;
        int ws=0;
        //int k=4;
        for(int i=0;i<k;i++){
            ws+=nums[i];
        }
        ms=ws;
        for(int i=k;i<nums.length;i++){
            ws+=nums[i];
            ws-=nums[i-k];
            ms=Math.max(ms,ws);
        }
        return(double)ms/k;
    }
}