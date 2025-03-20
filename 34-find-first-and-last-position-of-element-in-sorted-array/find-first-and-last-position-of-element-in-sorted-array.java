class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int val: nums){
            list.add(val);
        }
        int first = list.indexOf(target);
        int last = list.lastIndexOf(target);

        if(first == -1){
            last = -1;
        }
        int res[] = {first, last};
        return res;
        
    }
}