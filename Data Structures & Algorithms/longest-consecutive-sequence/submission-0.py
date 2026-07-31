class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        #empty array -> 
        #just one element ->
        #no consecutive sequence ->
        #can we sort the list?
        #2,4,5,6,7,10,20

        #a loop nested in another loop. start with the first number, and see if the next number
        #is one greater than the first. if not, move on, and see if that one is one greater. if it
        #is, update the counter value and keep the process going. 

        num_set = set(nums)
        longest_streak = 0

        for num in num_set:
            if (num - 1) not in num_set:
                current_num = num
                current_streak = 1

                while (current_num + 1) in num_set:
                    current_num += 1
                    current_streak += 1
                
                longest_streak = max(longest_streak, current_streak)

        return longest_streak
