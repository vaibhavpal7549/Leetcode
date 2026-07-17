public class NumArray {
    int[] tree;
    int[] nums;
    int n;


    public NumArray(int[] nums) {
        this.n = nums.length;
        this.nums = new int[n];
        this.tree = new int[n + 1];


        for(int i = 0; i < n; i++)
            update(i, nums[i]);
    }


    public void update(int index, int val){
        int delta = val - nums[index];
        nums[index] += delta;


        index++;
        while(index <= n){
            tree[index] += delta;
            index += index & (-index);
        }
    }


    private int query(int index){
        int sum = 0;
        index++;
        while(index > 0){
            sum += tree[index];
            index -= index & (-index);
        }
        return sum;
    }


    public int sumRange(int left, int right){
        return query(right) - query(left - 1);
    }  
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */