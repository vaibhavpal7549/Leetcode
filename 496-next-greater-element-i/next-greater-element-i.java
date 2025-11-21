class Solution {

    public static int next(int arr[], int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                int p = i+1;
                while(p<arr.length){
                    if(arr[p] >x)
                        return arr[p];
                    p++;
                }
                return -1;
            }
           
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //int ans[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            nums1[i] = next(nums2, nums1[i]);
        } 
        return nums1;  
    }
}