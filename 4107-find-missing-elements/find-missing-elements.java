class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for(int el: nums){
            if(el < min){
                min = el;
            }
            if(el > max){
                max = el;
            }
            set.add(el);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(min <= max){
            if(!set.contains(min)){
                ans.add(min);
            }
            min++;
        }
        return ans;




    }
}