class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() == t.length())
        {
           char [] charArray1 = s.toCharArray();
           char [] charArray2 = t.toCharArray();

           Arrays.sort(charArray1);
           Arrays.sort(charArray2);

           String sortedString1 = new String(charArray1);
           String sortedString2 = new String(charArray2);

           if (sortedString1.equals(sortedString2))
           {
            return true;
           }

          

        }

        return false;

    }
}
