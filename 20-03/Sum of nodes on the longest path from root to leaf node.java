class Solution{
    public int findHeight(Node root) {
        if(root == null) return 0;
        
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }
    int res = 0;
    public int findSum(Node root, int h, int sum) {
        if(h == 0) res = Math.max(res, sum); 
        if(root == null) return 0;
        sum += root.data;
        return Math.max(findSum(root.left, h-1, sum), findSum(root.right, h-1, sum)) + 1;
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        int h = findHeight(root);
        res = 0;
        findSum(root, h, 0);
        return res;
    }
}

