class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; //count of elements not equal to val

        for (int i = 0; i < nums.length; i++) //walk through each elemnet
        {
            if (nums[i] != val) //if it's not equal to val
            {
                nums[k] = nums[i]; //
                k++; //increment k
            }
        }

        return k;

   } 
}