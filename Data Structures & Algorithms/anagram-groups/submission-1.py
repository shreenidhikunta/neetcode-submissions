class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #first alphabetize each word
        #then group the same words together

        anagram_map = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            #word is sorted into character array. then it's joined together. the value before the join method is just saying what should be in between each character when joining

            if sorted_word not in anagram_map:
                anagram_map[sorted_word] = [word]
                #checking if the word isn't already in there
            else:
                anagram_map[sorted_word].append(word)
                #if it is, append the new word to the list 
        
        return list(anagram_map.values())
        #convert the dict back to a list 


        