class Solution {
    public int fibb(int a,int b, int count ,int n)
    {
        if(count==n)
        {
            return b;
        }
        
        int c= a+b;
        return fibb(b,c,count+1,n);
    }
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int x = fibb(0,1,1,n);
        return x;
    }
}