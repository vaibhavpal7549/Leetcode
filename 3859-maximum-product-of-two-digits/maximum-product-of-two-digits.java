class Solution {
    public int maxProduct(int n) {
        
        ArrayList<Integer> al = new ArrayList<>();
        while(n >0){
            int ld = n%10;
            al.add(ld);
            n = n/10;
        }
        int s = al.size();
        Collections.sort(al);
        return (al.get(s-1) * al.get(s-2));
    }
}