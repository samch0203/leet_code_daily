class Solution {
    public int removeElement(int[] nums, int val) {
        int W=0;
        int R=0;
        
        while(R<nums.length){
            if(nums[R] != val){
                nums[W]=nums[R];
                W++;
            }
            R++;
            

        }
        return W;
        
    }
    
}
