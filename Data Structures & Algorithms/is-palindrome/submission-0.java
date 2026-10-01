class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int end = s.length()-1;
        for (int start = 0; start < s.length(); start++) 
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            end--;
        }
        return true;
    }
}
