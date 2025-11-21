class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int e = n/2;
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i<n ;i++){
            h.add(candyType[i]);
        }
        int a = h.size();
        if(a<e){
            return a;
        }
        return e;

    }
}