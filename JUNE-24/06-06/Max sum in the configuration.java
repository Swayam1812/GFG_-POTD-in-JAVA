class Solution {
    long max_sum(int a[], int n) {
      
        long sum=0;
        long par=0;
        long val;
        for(int i=0;i<n;i++)
        {
            val=i;
            sum+=val*a[i];
            par+=a[i];
        }
        long res=sum;
        int k=n-1;
        long N=n;
        while(k>0)
        {
            sum=sum+par-(N*a[k]);
            res=Math.max(res,sum);
            k--;
        }
        return res;
    }
}.java
