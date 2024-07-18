class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int curr = nums[0];

        for(int i=0;i<nums.length;i++)
        {
            
            if(curr == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==-1)
            {
                curr = nums[i];
                count =0;
            }
        }
    return curr;
    }

}
