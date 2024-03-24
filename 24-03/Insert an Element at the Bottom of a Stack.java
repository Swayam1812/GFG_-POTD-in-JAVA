class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
      Stack<Integer> res = new Stack<>();
      Stack<Integer> temp = new Stack<>();
      while(!st.isEmpty()){
          temp.push(st.pop());
      }
      res.push(x);
      while(!temp.isEmpty()){
          res.push(temp.pop());
      }
      return res;
    }
}

