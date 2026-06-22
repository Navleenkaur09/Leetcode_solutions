class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        { return x;}

        int l=1;
        int r=x;
        int ans=0;
         while(l<=r)
         {
          int mid = l + (r - l) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;   // perfect square
            } 
            else if (sq < x) {
                ans = mid;    // possible answer
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
         } 
         return ans;

        
    }
}