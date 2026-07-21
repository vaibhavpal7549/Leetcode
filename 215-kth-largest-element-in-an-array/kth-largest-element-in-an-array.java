class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int el : nums){
            pq.offer(el);

            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();

    }
}