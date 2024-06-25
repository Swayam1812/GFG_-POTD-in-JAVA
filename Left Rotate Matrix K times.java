class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        int rows= mat.length;
        int columns = mat[0].length;
        k = k%columns;
        for(int i =0; i<rows; i++){
            swap(mat[i], 0, k-1);
            swap(mat[i], k, columns - 1);
            swap(mat[i], 0, columns-1);
        }
        return mat;
    }
    
    void swap(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }
}

