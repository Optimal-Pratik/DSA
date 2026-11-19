class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int traverse = 0; traverse < nums.length; traverse++)
        {
            if(nums[traverse] != 0)
            {
                int temp = nums[traverse];
                nums[traverse] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}