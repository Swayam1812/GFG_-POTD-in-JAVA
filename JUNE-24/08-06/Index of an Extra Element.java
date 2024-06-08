class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        int min = Math.min(arr1.length, arr2.length);
        for(int i = 0; i < min; i++) {
            if(arr1[i] != arr2[i]) return i;
        }
        
        if(arr1.length > arr2.length) return arr1.length - 1;
        
        return arr2.length - 1;
    }
}
