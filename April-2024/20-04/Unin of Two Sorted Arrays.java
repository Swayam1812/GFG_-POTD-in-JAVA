class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        HashSet<Integer> ans= new HashSet<>();
        for(int i=0;i<n;i++){
               ans.add(arr1[i]);}
        for(int j=0;j<m;j++){
                ans.add(arr2[j]); }
                ArrayList<Integer> ans1= new ArrayList<>(ans);
             Collections.sort(ans1);
             return ans1;
    }
}
