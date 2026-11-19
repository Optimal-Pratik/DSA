class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int traverse = 0;
        while(traverse < nums.length)
        {
            if(nums[left] != nums[traverse])
            {
                nums[left+1] = nums[traverse];
                left++;
            }
            traverse++;
        }
        return left+1;
    }
}