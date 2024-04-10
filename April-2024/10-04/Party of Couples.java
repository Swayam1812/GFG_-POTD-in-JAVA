class Solution{
    static int findSingle(int n, int arr[]){
       HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hash.containsKey(arr[i])){
                hash.put(arr[i],1);
            }
            else{
                hash.put(arr[i],hash.get(arr[i])+1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
          
                if(entry.getValue()%2!=0){
                    return entry.getKey();
                }
            
        }
        return 0;
    }
}
