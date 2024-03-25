class Solution {
    public void solve(String a, int i, int r, ArrayList<String>re){
        
        if(r==0){
            re.add(a);
            return;
        }
        solve(a+"1",i+1,r-1,re);
        if(i>0){
            solve(a+"0",i-1,r-1,re);
        }
        
    }
    ArrayList<String> NBitBinary(int n) {
        // code here
        ArrayList<String> ans= new ArrayList<>();
        String a="";
        solve(a,0,n,ans);
        return ans;
    }
}
