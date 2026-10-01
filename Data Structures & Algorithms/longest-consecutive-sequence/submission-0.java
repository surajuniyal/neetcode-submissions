class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int result = 0;
        int temp = 0;
        for (int i : nums) {
            
            if (!set.contains(i - 1)) {
                temp = 1;
                int current = i;
                while (set.contains(current + 1)) {
                    if (set.contains(current + 1)) {
                        temp++;
                    }
                    current++;
                }
                result = temp > result ? temp : result;
            }
            
        }
        return result;
    }
}
