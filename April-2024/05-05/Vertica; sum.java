class Solution{
    public void dfs(Node root,List<int[]> al,int l){
        if(root==null) return;
        al.add(new int[]{l,root.data});
        dfs(root.left,al,l-1);
        dfs(root.right,al,l+1);
    }
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        List<int[]> al=new ArrayList<>();
        dfs(root,al,0);
        ArrayList<Integer> ans=new ArrayList<>();
        Collections.sort(al,(x,y)->x[0]-y[0]);
        int sum=0,pre=(int)(1e9);
        for(int[] a:al){
            if(pre==(int)(1e9)){
                pre=a[0];
                sum+=a[1];
            }
            else if(pre!=a[0]){
                ans.add(sum);
                pre=a[0];
                sum=a[1];
            }
            else sum+=a[1];
        }
        ans.add(sum);
        return ans;
    }
}
