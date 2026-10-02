class Solution {
    public int search(int[] nums, int target) {
     int result = -1;
     int l = 0, r= nums.length-1;

     while(l<=r)
     {
        int m = l+(r-l)/2;
        if(nums[m]==target)
        {
            result = m;
            break;
        }
        //m is part of left sprted array
        if(nums[l] <= nums[m])
        {
            //target is not in left of mid move l to right of m 
            if(target > nums[m] || target < nums[l])
            {
                l = m+1;
            }
            else // target is  in left of mid move r to left of m 
            {
                r= m-1;
            }
        }
        else // m is part of right sorted array 
        {
            if (target < nums[m] || target > nums[r])
            {
                r = m-1 ;
            }
            else
            {
                l= m+1;
            }
        }
     }
     return result;   
    }
}
