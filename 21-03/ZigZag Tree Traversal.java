class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        ArrayList<Integer> result=new ArrayList <>();
        if(root==null){
            return result;
        }
        Queue <Node> q=new LinkedList <Node> ();
        q.add(root);
        boolean flag=false;
        while(q.size() >0){
            int n=q.size();
            ArrayList <Integer> currentLevel =new ArrayList <>();
            for(int i=0;i<n;i++){
            Node curr=q.poll();
            currentLevel.add(curr.data);
            if(curr.left !=null){
                q.add(curr.left);
            }
            if(curr.right !=null){
                q.add(curr.right);
                }
            }
            if(flag==true){
                Collections.reverse(currentLevel);
            }
            
            for(int i : currentLevel){
                result.add(i);
            }
            flag=!flag;
        }
        return result;
    }
}
