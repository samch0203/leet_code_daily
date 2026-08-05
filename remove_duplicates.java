class Solution {
    public int removeDuplicates(int[] nums) {
        int W=0;
        int R=1;

        while(R<nums.length){
            if(nums[W]== nums[R]){
                R++;
            }
            else{
                W++;
                nums[W]=nums[R];
                R++;
            }
            
        }
        return W+1;
    }
    
}
