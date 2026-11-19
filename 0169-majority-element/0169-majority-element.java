class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement  = nums[0];
        int vote = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] == majorityElement)
            {
                vote++;
            }
            else if(vote == 0)
            {
                majorityElement = nums[i];
                vote = 1;
            }
            else
            {
                vote--;
            }
        }
        return majorityElement;

    }
}