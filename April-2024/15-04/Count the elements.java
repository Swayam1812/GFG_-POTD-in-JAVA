class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
     int[] arr= new int[100001];
     
     for(int i=0;i<n;i++){
         arr[b[i]]++;
     }
     
     for(int i=1;i<100001;i++){
         arr[i]=arr[i]+arr[i-1];
     }
     
     int[] soln= new int[q];
     
     for(int i=0;i<q;i++){
         soln[i]= arr[a[query[i]]];
     }
     
     return soln;
    }
}
