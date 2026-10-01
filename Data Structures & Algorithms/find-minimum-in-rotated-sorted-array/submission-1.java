class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, result = nums[0];

        while (l <= r) {
            //if we reached at sorted array then return min/starting value
            if (nums[l] < nums[r]) {
                result = Math.min(result, nums[l]);
                break;
            }
            //Cal min index
            int m = r + l / 2;
            result = Math.min(result, nums[m]);
            //if element at m/mid is greater than elemect at l means left part is sorted and min min is not there as elemt at l!<r hence move to another part 
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return result;
    }
}
