class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        first_dict = {}
        second_dict = {}

        for i in s:
            if i in first_dict: 
                first_dict[i] += 1
            else: 
                first_dict[i] = 1

        for i in t:
            if i in second_dict: 
                second_dict[i] += 1
            else: 
                second_dict[i] = 1
        
        if second_dict == first_dict:
            return True
        
        return False



        