import java.util.HashSet;

class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] count = new int[51];

        // Check every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            // Store unique elements of this subarray
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count each element once for this subarray
            for (int num : set) {
                count[num]++;
            }
        }

        // Find largest number appearing in exactly one subarray
        for (int num = 50; num >= 0; num--) {
            if (count[num] == 1) {
                return num;
            }
        }

        return -1;
    }
}
