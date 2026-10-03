class Solution {
    public int characterReplacement(String s, int k) {
        int [] countArrForAtoZ = new int[26];
        int result = 0, l = 0, maxfr = 0;

        for(int r = 0 ; r < s.length() ; r++)
        {
            //incress occurence count of current element
            countArrForAtoZ[s.charAt(r) - 'A']++; 
            maxfr = Math.max(maxfr , countArrForAtoZ[s.charAt(r) - 'A']);

            while(r-l+1-maxfr > k)
            {
                countArrForAtoZ[s.charAt(l) - 'A']--;
                l++;
            }

            result = Math.max(result, r-l+1);

        }
        return result;
    }
}
