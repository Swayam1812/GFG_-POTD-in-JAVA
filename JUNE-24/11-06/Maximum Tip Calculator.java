class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        
        
        int aar[][]=new int[n][3];
        for(int i=0;i<n;i++){
            aar[i][0]=arr[i];
            aar[i][1]=brr[i];
            aar[i][2]=arr[i]-brr[i];
        }
        Arrays.sort(aar,(r,t)->t[2]-r[2]);
        //System.out.println(aar[0][0]);
        int ele=n-y;
        long ans = 0;
        for(int i=0;i<n;i++){
            if(ele-->0 || (x>0 && aar[i][2]>0))ans+=aar[i][0];
            else ans+=aar[i][1];
            x--;
        }
        return ans;
    }
}
