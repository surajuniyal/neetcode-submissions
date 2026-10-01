class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int result = 0;
        //Using two pointer
        while(l < r)
        {
            //cal Area
            int area = Math.min(heights[l],heights[r]) * (r - l);
            //taking max area every iteration
            result = Math.max(result, area);
            //move l/r pointer for less height 
            if(heights[l] <= heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
            
        }
        return result;
    }
}
