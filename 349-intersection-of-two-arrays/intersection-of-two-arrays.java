import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int itr: nums1){
            set1.add(itr);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int itr: nums2){
            set2.add(itr);
        }
        set1.retainAll(set2);
        int[] ans = new int[set1.size()];
        int index = 0;
        for(int itr:set1){
            ans[index] = itr;
            index++;
        }
        return ans;

        
        
    }
}