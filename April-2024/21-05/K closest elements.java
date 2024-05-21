class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        
         
         int ans[] = new int[k];
         int ind = 0;
         
         int l = binarySearch(arr , 0 , n-1 , x);
         int r = l+1;
         
         if(arr[l] == x ) l--;
         
         while(l >= 0 && r < n && ind < k){
            
            if(x - arr[l] < arr[r] - x){
                ans[ind++] = arr[l];
                l--;
            }
            else{
                ans[ind++] = arr[r];
                r++;
            }
         }
         
         while( l>= 0 && ind < k ) {
             ans[ind++] = arr[l];
                l--;
         }
         
         while( r < n && ind < k ) {
             ans[ind++] = arr[r];
                r++;
         }
         
         
        return ans;
    }
    
    int binarySearch(int arr[] , int l , int h , int x){
        
        while(l <= h){
            
            int mid = l + (h - l)/2;
            
            if(arr[l] > x ){
                return l;
            }
            if(arr[h] <= x){
                return h;
            }
            
            if(arr[mid] <= x && arr[mid + 1] > x){
                return mid;
            }
            
            if(arr[mid] > x){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}
