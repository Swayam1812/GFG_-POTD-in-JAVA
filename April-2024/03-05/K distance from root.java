class Tree{
     ArrayList<Integer> Kdistance(Node root, int k){
          ArrayList<Integer> list = new ArrayList<>();
          solution(root, list, k, 0);
          return list;
     }
     void solution(Node root, ArrayList<Integer> list, int k, int n){
         if (root == null) return;
         if (k == n) {
             list.add(root.data);
             return;
         }
         solution(root.left, list, k, n+1);
         solution(root.right, list, k, n+1);
     }
}
