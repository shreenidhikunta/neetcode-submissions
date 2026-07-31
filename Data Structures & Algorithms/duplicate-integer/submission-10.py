class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()

        for num in nums: 
            if num in seen: 
                return True
            
            seen.add(num)
        
        return False 

        #make a hashset 
        #iterate through the list
        #as you move on, if a value is equal to something that's already there in the hashset, exit the loop early and return True 
        #iterate through the list, add value if it's not already in the hashset
      