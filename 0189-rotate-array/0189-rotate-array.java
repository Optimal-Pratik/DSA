class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k % nums.length;
        reverse(nums, nums.length - rotate, nums.length-1);
        reverse(nums, 0, nums.length - 1 - rotate);
        reverse(nums, 0,nums.length-1);
    }
    private void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}