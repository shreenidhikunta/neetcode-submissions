class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> comp  = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int need = target - nums[i];

            if (comp.containsKey(need))
            {
                return new int [] { comp.get(need), i};
            }

            comp.put(nums[i], i);
        }

        return new int[0];


        
    }
}
