class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer, Integer> values = new HashMap<>(); //Key -> number, Value -> count of number 

        for (int i = 0; i < nums.length; i++)
        {
            if (values.containsKey(nums[i]))
            {
                values.put(nums[i], values.get(nums[i]) + 1);

                if (values.get(nums[i]) > (nums.length / 2))
                {
                    return nums[i];
                }
            }
            else
            {
                values.put(nums[i], 1);
                if (nums.length == 1) {
                    return nums[i];
                }
            }
        }

        return 0;







        
    }
}