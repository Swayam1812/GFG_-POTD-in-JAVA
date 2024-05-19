class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int clo=arr[0];
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-k) < Math.abs(clo-k)){
                clo=arr[i];
            }
            else if(Math.abs(arr[i]-k) == Math.abs(clo-k)){
                clo=Math.max(clo,arr[i]);
            }
        }
        return clo;
        
    }
}
