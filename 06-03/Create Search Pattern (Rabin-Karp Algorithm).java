class Solution {
    ArrayList<Integer> search(String pattern, String text) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = pattern.length();
        for(int i=0; i<=text.length()-n; i++) {
            if(text.charAt(i) != pattern.charAt(0)) 
                continue;
            if(pattern.equals(text.substring(i, i+n))) 
                res.add(i+1);
        }
        return res;
    }
}
