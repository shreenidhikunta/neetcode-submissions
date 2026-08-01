class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #first check if the value is in the dictionary
        #if it's not there, add its complement
        #iterate through, and check if the value is in the dictionary
        #if it is, you've found a sum! 

        lookup = {} 

        for i, num in enumerate(nums):
            if num in lookup:
                return [lookup[num], i]
            else: 
                lookup[target - num] = i
                #key is complement, i is index of num in the list 
        