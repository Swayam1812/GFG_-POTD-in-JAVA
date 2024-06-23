class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        ArrayList<Integer> bracketNumber = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        int count = 0;
        
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                count += 1;
                stack.push(count);
                bracketNumber.add(count);
            }
            else if (str.charAt(i) == ')'){
                bracketNumber.add(stack.pop());
            }
            
        }
        
        return bracketNumber;
    }
};
