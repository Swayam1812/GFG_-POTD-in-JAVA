class Solution {
    public char nthCharacter(String s, int r, int n) {
        for (int i = 0; i < r; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) == '1') sb.append("10");
                else sb.append("01");
                
                if (j > n) break;
            }
            s = sb.toString();
        }
        return s.charAt(n);
    }
}
