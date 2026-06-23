class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]  left=new int[n];
        int[] right=new int[n];
        int lt=1;
        int rt=1;
        for(int i=0;i<n;i++)
        {
          left[i]=lt;
          lt*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            right[i]=rt;
            rt*=nums[i];
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}