class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        int rem;
        int n=x;
        if(x<0)
        {return false;}
        
                while(n!=0)
        {
            rem=n%10;
             rev=(rev*10)+rem;
            n=n/10;
        }
        if(rev==x)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}