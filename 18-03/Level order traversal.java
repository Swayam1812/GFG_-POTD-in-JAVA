class Solution
{
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        if (node == null) {
            return res;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            res.add(curr.data);
            
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        
        return res;
    }
}

