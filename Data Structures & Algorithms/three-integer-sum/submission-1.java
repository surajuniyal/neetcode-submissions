class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Sort the Array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        //loop to iterate first element
        for (int i = 0; i < nums.length; i++) {
            //if first element of sorted array is greater than target then break;
            if (nums[i] > 0) {
                break;
            }
            //ignoring duplicate
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //took first element and for remaining two used twosum II
            int l = i + 1, r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    //skiping duplicate for remaing two elements
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return result;
    }
}
