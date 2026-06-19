class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int ans = 0;
        int i = 0;
        int j = plants.length-1;
        int tempA = capacityA;
        int tempB = capacityB;
        while(i < j){


            if(capacityA < plants[i]){
                capacityA = tempA;
                ans++;
                
            }

            if(capacityB < plants[j]){
                capacityB = tempB;
                ans++;
                
            }
        
            capacityA -= plants[i];
            capacityB -=  plants[j];
            i++;
            j--;
        }
        if (i == j) {
            int available = Math.max(capacityA, capacityB);

            if (available < plants[i]) {
                ans++;
            }
        }
        return ans;
    }
}