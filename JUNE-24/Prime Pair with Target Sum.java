class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int start = n-(n-1);
        int end = n-1;
        
        for(int i = 1; i <= n/2; i++){
            if(prime(start) && prime(end)){
                arr.add(start);
                arr.add(end);
                break;        
            }
            start++;
            end--;
        }
        
        
        if(arr.size() == 0){
            arr.add(-1);
            arr.add(-1);
        }
        
        return arr;
    }
    
    public static boolean prime(int val){
        
        if(val == 1) return false;
        
        for(int i = 2; i <= Math.sqrt(val); i++){
            if(val%i == 0) return false;
        }
        return true;
    }
}
