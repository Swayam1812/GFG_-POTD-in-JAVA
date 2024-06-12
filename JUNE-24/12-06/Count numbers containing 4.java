class Solution {
    public static int countNumberswith4(int n) {
        int count =0; 
        for(int i=0;i<=n;i++){
            String s= Integer.toString(i);
            if(s.contains("4")){
                count++;
            }
        }
        return count;
    }
}

