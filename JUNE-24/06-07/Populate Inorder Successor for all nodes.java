class Solution {
    ArrayList<Node> inOrderAL = new ArrayList<>();
    int size = 0;
    
    public void populateNext(Node root) {
        inOrder(root);
    }
    
    public void inOrder(Node root){
        if (root != null){
            inOrder(root.left);
            inOrderAL.add(root);
            size += 1;
            if (size >= 2){
                inOrderAL.get(size - 2).next = root;
            }
            inOrder(root.right);
        }
    }
}
