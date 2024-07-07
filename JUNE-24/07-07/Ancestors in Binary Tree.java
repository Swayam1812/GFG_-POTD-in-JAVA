class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        boolean is = call(root,list,target);
        
        return list;
    }
    public boolean call(Node root, ArrayList<Integer> list, int target)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == target)
        {
            return true;
        }
        
        if(call(root.left,list,target))
        {
            list.add(root.data);
            return true;
        }
        if(call(root.right,list,target))
        {
            list.add(root.data);
            return true;
        }
        
        return false;
    }
}
