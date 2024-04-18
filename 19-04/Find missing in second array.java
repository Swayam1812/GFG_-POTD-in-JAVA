class Solution {
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int val = hashMap.getOrDefault(b[i], 0);
            hashMap.put(b[i], val + 1);
        }
        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(a[i])) {
                arr.add(a[i]);
            }
        }
        return arr;
    }
}

